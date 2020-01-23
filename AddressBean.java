package com.blz.oops.model;

public class AddressBean {
	private String city;
	private String state;
	private String zip;
	public AddressBean() {
		
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
	public AddressBean(String city, String state, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "city=" + city + ", state=" + state + ", zip=" + zip ;
	}
	
	

}
