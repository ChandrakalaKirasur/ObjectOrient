package com.blz.oops.controller;

import com.blz.oops.model.InventoryBean;
import com.blz.oops.service.InventoryService;
import com.blz.oops.utils.InputUtility;
import com.blz.service.impl.InventoryServiceImpl;

public class InventoryManagement {
	private static InventoryBean bean;
	private static InventoryService service;
	
	public static void main(String[] args) {
		int choice=0;
		int[] total=new int[4];
		service = new InventoryServiceImpl();
		String name="",info="",weight="",price="";
		do {
			System.out.println("Enter 1 for give rice details");
			System.out.println("enter 2 for give pulses details");
			System.out.println("enter 3 for give wheats details");
			System.out.println("enter 4 for get price per things and total price for all the things you buy");
			System.out.println("enter 5 for exit");
			choice=InputUtility.inputInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name of rice,weight and price by separating with comma(,)");
				info=InputUtility.inputString();
				String[] words=info.split(",");name=words[0];
				weight=words[1];
				price=words[2];
				bean=new InventoryBean(name,weight,price);
				service.writeToFile(bean,"Rice");
			case 2:
				System.out.println("Enter name of pulses,weight and price by separating with comma(,)");
				info=InputUtility.inputString();
				String[] words1=info.split(",");name=words1[0];
				weight=words1[1];
				price=words1[2];
				bean=new InventoryBean(name,weight,price);
				service.writeToFile(bean,"Pulses");
			case 3:
				System.out.println("Enter name of wheats,weight and price by separating with comma(,)");
				info=InputUtility.inputString();
				String[] words2=info.split(",");name=words2[0];
				weight=words2[1];
				price=words2[2];
				bean=new InventoryBean(name,weight,price);
				service.writeToFile(bean,"Wheats");
				break;
			case 4:
				total=service.readFromFile(total);
				System.out.println("price for rice is "+total[0]);
				System.out.println("price for pulses is "+total[1]);
				System.out.println("price for rice wheats is "+total[2]);
				int totalPrice=service.getTotalPrice(total);
				System.out.println("Total price for your things is "+totalPrice+" Rs.\n");
				break;
			case 5:
				System.out.println("Thanks for shopping, come again...!!!");
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}

		} while (choice != 5);
	}

}
