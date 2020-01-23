package com.blz.oops.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.blz.oops.model.RegisterBean;
import com.blz.oops.service.RegisterService;
import com.blz.oops.utils.InputUtility;
import com.blz.oops.service.impl.RegisterServiceImpl;

public class Register {
	private static RegisterBean bean;
	private static RegisterService service;
	static String name;
	static String fullName;
	static String phoneNum;

	public static void main(String[] args) {
		int k=0;
		
		service=new RegisterServiceImpl();
		 do {
			 System.out.println("Enter 1 for register");
			 System.out.println("Enter 2 for exit");
			 k=InputUtility.inputInt();
			 switch(k){
		 	case 1:
		 		System.out.println("Enter your first name");
		 		name=InputUtility.inputString();
		 		System.out.println("Enter your last name");
		 		fullName=InputUtility.inputString();
		 		System.out.println("Enter your phone number");
		 		phoneNum=InputUtility.inputString();
		 		Date date=new Date();SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		 		String mdate=sdf.format(date);
		 		bean=new RegisterBean(name,name+" "+fullName,phoneNum,mdate);
		 		String message=service.saveInfo(bean);
		 		System.out.println(message);
		 		break;
			case 2:
				System.out.println("Good day...!!!");
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}

		} while (k != 2);
		
	}

}
