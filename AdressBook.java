package com.blz.oops.controller;

import com.blz.oops.model.PersonBean;
import com.blz.oops.service.AddresssBookService;
import com.blz.oops.service.impl.AddressBookServiceImpl;
import com.blz.oops.utils.InputUtility;

public class AdressBook {
	private static PersonBean person;
	private static AddresssBookService service;

	public static void main(String[] args) {
		int k=0;
		 service=new AddressBookServiceImpl();
		 String name,address,city,state,zip,phoneNum,mname;
		 do {
			 System.out.println("Enter 1 to add person,2 to edit, 3 for delete person info and 4 to exit");
			 k=InputUtility.inputInt();
			 switch(k){
		 	case 1:
		 		System.out.println("Enter person name");
		 		name=InputUtility.inputString();
		 		System.out.println("Enter address");
		 		address=InputUtility.inputString();
		 		System.out.println("Enter city");
		 		city=InputUtility.inputString();
		 		System.out.println("Enter state");
		 		state=InputUtility.inputString();
		 		System.out.println("Enter zip code");
		 		zip=InputUtility.inputString();
		 		System.out.println("Enter persons phone number");
		 		phoneNum=InputUtility.inputString();
		 		person=new PersonBean(name,address,city,state,zip,phoneNum);
		 		service.saveToFile(person);
				break;
			case 2:
				String s=service.getNames();
				System.out.println("We have list of Names, "+s+" so type name to edit information");
				mname=InputUtility.inputString();
				System.out.println("Enter person name");
		 		name=InputUtility.inputString();
		 		System.out.println("Enter address");
		 		address=InputUtility.inputString();
		 		System.out.println("Enter city");
		 		city=InputUtility.inputString();
		 		System.out.println("Enter state");
		 		state=InputUtility.inputString();
		 		System.out.println("Enter zip code");
		 		zip=InputUtility.inputString();
		 		System.out.println("Enter persons phone number");
		 		phoneNum=InputUtility.inputString();
		 		person=new PersonBean(name,address,city,state,zip,phoneNum);
				System.out.println(service.editInfo(mname,person));
				break;
			case 3:
				String s1=service.getNames();System.out.println(s1);
				System.out.println("We have list of Names, so type name to delete information from address book");
				mname=InputUtility.inputString();
				System.out.println(service.deleteInfo(mname));
				break;
			case 4:
				System.out.println("Good day...!!!");
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}

		} while (k != 4);
	}

}
