/**
 * 
 */
package com.blz.oops.service.impl;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blz.oops.controller.StockReport;
import com.blz.oops.service.StockAccountService;
import com.blz.oops.service.StockService;

/**
 * @author Chandrakala Kirasur
 *
 */
public class StockAccountServiceImpl implements StockAccountService{
	private static StockService serv;
	private static StockService service=new StockServiceImpl();

	JSONObject inMap=new JSONObject();
	JSONArray inlist=new JSONArray(); 
	@Override
	public void createAccount(String file) {
		StockReport stockr=new StockReport();
		stockr.giveInformation(file,service);
	}

	@Override
	public String valueOf() {
		String amount=service.getTotalStock();
		return amount;
	}

	@Override
	public void sell(int amount, String symbol) {
		JSONParser jsonParse=new JSONParser();
		try(FileReader f=new FileReader("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
			JSONObject obj=(JSONObject) jsonParse.parse(f);
			JSONArray arr=(JSONArray) obj.get("Stock");
			for(int i=0;i<arr.size();i++) {
				JSONObject object=(JSONObject) arr.get(i);
				if(object.get("ShareSymbol").equals(symbol)) {	
				String num=(String) object.get("ShareNum");
				int num1=Integer.parseInt(num);
				num=num1-amount+"";
				object.put("ShareNum",num);
				inlist.add(object);
				}
				else {
					inlist.add(object);}
				inMap.put("Stock", inlist);
				try(FileWriter fw=new FileWriter("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
					fw.write(inMap.toJSONString());	
				}
				catch(Throwable t) {
					t.printStackTrace();
				}
			}
		}catch(Throwable t) {
			t.printStackTrace();
		}
		
		
	}

	@Override
	public String printReport() {
		String total="";int totalShare =0;
		JSONParser jsonParse=new JSONParser();
		try(FileReader f=new FileReader("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
			JSONObject obj=(JSONObject) jsonParse.parse(f);
			JSONArray arr=(JSONArray) obj.get("Stock");
			for(int i=0;i<arr.size();i++) {
				JSONObject object=(JSONObject) arr.get(i);
				String name=(String) object.get("ShareName");
				String sym=(String) object.get("ShareSymbol");
				String num=(String)object.get("ShareNum");
				String price=(String)object.get("SharePrice");
				int k=Integer.parseInt(num);
				int w=Integer.parseInt(price);
				total +=name+" "+sym+" "+num+" "+price+"\n";
			}
		}catch(Throwable t) {
			t.printStackTrace();
		}
		return total;
	}

	@Override
	public void buyStock(int amount, String symbol) {
		JSONParser jsonParse=new JSONParser();
		try(FileReader f=new FileReader("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
			JSONObject obj=(JSONObject) jsonParse.parse(f);
			JSONArray arr=(JSONArray) obj.get("Stock");
			for(int i=0;i<arr.size();i++) {
				JSONObject object=(JSONObject) arr.get(i);
				if(object.get("ShareSymbol").equals(symbol)) {
				String num=(String) object.get("ShareNum");
				int num1=Integer.parseInt(num);
				num=num1+amount+"";
				object.put("ShareNum",num);
				inlist.add(object);
				}
				else {
					inlist.add(object);}
				inMap.put("Stock", inlist);
				try(FileWriter fw=new FileWriter("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
					fw.write(inMap.toJSONString());	
				}
				catch(Throwable t) {
					t.printStackTrace();
				}
				
			}
		}catch(Throwable t) {
			t.printStackTrace();
		}
		
	}
}
