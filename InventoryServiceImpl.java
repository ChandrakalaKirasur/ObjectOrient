package com.blz.service.impl;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blz.oops.model.InventoryBean;
import com.blz.oops.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {
	JSONArray inList=new JSONArray();
	@Override
	public void writeToFile(InventoryBean bean,String word) {
		inList=writeToJson(inList,bean,word);
		JSONObject manage=new JSONObject();
		manage.put("inventoryList", inList);
		try(FileWriter f=new FileWriter("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/service/impl/Invent.json")){
			f.write(manage.toJSONString());	
		}
			catch(Throwable t) {
				t.printStackTrace();
			}
	}
	private static JSONArray writeToJson(JSONArray inList,InventoryBean bean,String word) {
		JSONObject things =new JSONObject();
		things.put("Name",bean.getName());
		things.put("Weight",bean.getWeight());
		things.put("Price",bean.getPrice());
		JSONObject thingsObj =new JSONObject();
		thingsObj.put(word,things);
		inList.add(thingsObj);
		return inList;
	}

	@Override
	public int[] readFromFile(int[] total) {
		JSONParser jsonParse=new JSONParser();
		try(FileReader f=new FileReader("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/service/impl/Invent.json")){
			JSONObject obj=(JSONObject) jsonParse.parse(f);
			JSONArray arr=(JSONArray) obj.get("inventoryList");
			String[] words= {"Rice","Pulses","Wheats"};
			for(int i=0;i<3;i++) {
				JSONObject object=(JSONObject) arr.get(i);
				JSONObject object1=(JSONObject)object.get(words[i]);
				String name=(String) object1.get("Name");
				String price=(String)object1.get("Price");
				String weight=(String)object1.get("Weight");
				int k=Integer.parseInt(price);
				int w=Integer.parseInt(weight);
				total[i]=k*w;}
			return total;
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
		return null;
	}
	@Override
	public int getTotalPrice(int[] total) {
		int totalPrice=0;
		for(int i=0;i<total.length;i++) {
			totalPrice+=total[i];
		}
		return totalPrice;
	}
	

}
