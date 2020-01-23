package com.blz.oops.model;

public class PersonBean {
	private String name;
	private AddressBean address;
	private String phoneNum;
	public PersonBean() {
		
	}
	@Override
	public String toString() {
		return "Person name=" + name + ", address: " + address + ", phoneNum=" + phoneNum ;
	}
	public PersonBean(String name, AddressBean address, String phoneNum) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
