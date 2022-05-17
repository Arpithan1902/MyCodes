package com.ecom.bean;

public class Product {
	private int pId;
	private String pName;
	private double pPrice;
	private String category;
	
	
	public Product(int pId, String pName, double pPrice, String category) {
		super();
		this.category=category;
		this.pId=pId;
		this.pPrice=pPrice;
		this.pName=pName;
	}
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
