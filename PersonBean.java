package com.blz.oops.model;

public class PersonBean {
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	public PersonBean() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public PersonBean(String name, String address, String city, String state, String zip, String phoneNum) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "name= " + name + " , address=" + address + " , city=" + city + " , state=" + state + " , zip="
				+ zip + " , phoneNum=" + phoneNum;
	}
	
}
