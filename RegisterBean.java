package com.blz.oops.model;

public class RegisterBean {

	private String name;
	private String fullName;
	private String phoneNum;
	private String date;
	public RegisterBean() {
		System.out.println("Good Morning");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public RegisterBean(String name, String fullName, String phoneNum, String date) {
		super();
		this.name = name;
		this.fullName = fullName;
		this.phoneNum = phoneNum;
		this.date = date;
	}
	
}
