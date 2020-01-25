package com.blz.oops.controller;

import com.blz.oops.service.StockAccountService;
import com.blz.oops.service.impl.StockAccountServiceImpl;
import com.blz.oops.utils.InputUtility;

public class StockAccount {
	private static StockAccountService service;

	public static void main(String[] args) {
		int choice=0;String file="",symbol="";int amount=0;
		service=new StockAccountServiceImpl();
		do {
		System.out.println("Enter 1 for create account from file");	
		System.out.println("Enter 2 to get total value of account dollors");	
		System.out.println("Enter 3 to buy shares of stock");	
		System.out.println("Enter 4 to sell shares of stock from account");	
		System.out.println("Enter 5 to get report");
		System.out.println("Enter 6 to exit");
		choice=InputUtility.inputInt();
		switch(choice) {
		case 1:System.out.println("Enter file to create account");
				file=InputUtility.inputString();
				service.createAccount(file);
				System.out.println("Account created successfully");
			break;
		case 2:
			System.out.println(service.valueOf());
			break;
		case 3:
			System.out.println("Enter amount to buy shares to your stock");
			amount=InputUtility.inputInt();
			System.out.println("enter symbol for to store ur stock");
			symbol=InputUtility.inputString();
			service.buyStock(amount, symbol);
			break;
		case 4:
			System.out.println("Enter amount of shares to sell");
			amount=InputUtility.inputInt();
			System.out.println("Enter symbol to sell");
			symbol=InputUtility.inputString();
			service.sell(amount, symbol);
			break;
		case 5:
			System.out.println("report of stock in the format of ");
			System.out.println("stock name,  symbol, number of share and share price");
			System.out.println(service.printReport());
			break;
		case 6:
			System.out.println("Good day...!!!");
			break;
		default:
			System.out.println("Enter Valid Choice");
			break;
		}
		
		}while(choice!=6);
	}

}
