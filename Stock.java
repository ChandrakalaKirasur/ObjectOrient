package com.blz.oops.model;

public class Stock {
	private String shareName;
	private int shareNum;
	private int sharePrice;
	public Stock() {
		
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getShareNum() {
		return shareNum;
	}
	public void setShareNum(int shareNum) {
		this.shareNum = shareNum;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Stock(String shareName, int shareNum, int sharePrice) {
		super();
		this.shareName = shareName;
		this.shareNum = shareNum;
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return "Stock shareName=" + shareName + ", shareNum=" + shareNum + ", sharePrice=" + sharePrice;
	}
	
}
