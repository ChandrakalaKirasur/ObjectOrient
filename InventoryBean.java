package com.blz.oops.model;

public class InventoryBean {
	private String name;
	private String price;
	private String weight;
	
	public InventoryBean() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public InventoryBean(String name, String price, String weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "InventoryBean [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	
	
}
