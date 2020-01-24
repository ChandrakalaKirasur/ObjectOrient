/**
 * 
 */
package com.blz.oops.service.impl;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blz.oops.model.Stock;
import com.blz.oops.service.StockService;

/**
 * @author user
 *
 */
public class StockServiceImpl implements StockService {

	JSONObject inMap=new JSONObject();
	JSONArray inlist=new JSONArray(); 
	@Override
	public void saveToJson(Stock stock) {
		JSONObject stocks=new JSONObject();
		stocks.put("SharePrice", stock.getSharePrice()+"");
		stocks.put("ShareName", stock.getShareName());
		stocks.put("ShareNum", stock.getShareNum()+"");
		inlist.add(stocks);
		inMap.put("Stock", inlist);
		try(FileWriter f=new FileWriter("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
			f.write(inMap.toJSONString());	
		}
		catch(Throwable t) {
			t.printStackTrace();
		}
		
	}

	@Override
	public String getTotalStock(int stocks) {
		String total="";int totalShare =0;
		JSONParser jsonParse=new JSONParser();
		try(FileReader f=new FileReader("/home/user/eclipse-workspace/OOProgramming/src/main/java/com/blz/oops/service/impl/Stock.json")){
			JSONObject obj=(JSONObject) jsonParse.parse(f);
			JSONArray arr=(JSONArray) obj.get("Stock");
			for(int i=0;i<stocks;i++) {
				JSONObject object=(JSONObject) arr.get(i);
				String name=(String) object.get("ShareName");
				String num=(String)object.get("ShareNum");
				String price=(String)object.get("SharePrice");
				int k=Integer.parseInt(num);
				int w=Integer.parseInt(price);
				total +="total share of "+name+" is "+(k*w)+" ,"+"\n";
				totalShare += k*w;
			}
		}catch(Throwable t) {
			t.printStackTrace();
		}
		return total+" total share stock price is "+totalShare;
	}

}
