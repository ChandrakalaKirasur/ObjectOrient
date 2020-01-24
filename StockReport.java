package com.blz.oops.controller;

import com.blz.oops.model.Stock;
import com.blz.oops.service.StockService;
import com.blz.oops.service.impl.StockServiceImpl;
import com.blz.oops.utils.InputUtility;

public class StockReport {
	private static Stock stock;
	private static StockService service;

	public static void main(String[] args) {
		String shareName="";
		int shareNum=0,sharePrice=0;
		service=new StockServiceImpl();
		System.out.println("Enter number of stocks you have");
		int stocks=InputUtility.inputInt();
		for(int i=0;i<stocks;i++) {
			System.out.println("Enter share name");
			shareName=InputUtility.inputString();
			System.out.println("Enter number of share for this stock");
			shareNum=InputUtility.inputInt();
			System.out.println("enter share price for this stock");
			sharePrice=InputUtility.inputInt();
			stock=new Stock(shareName,shareNum,sharePrice);
			service.saveToJson(stock);	
		}
		System.out.println(service.getTotalStock(stocks));
	}

}
