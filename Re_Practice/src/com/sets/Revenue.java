package com.sets;

public class Revenue {
	private String revCategory;
	private int amount;
	public String getRevenueCategory() {
		return revCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revCategory = revenueCategory;
		this.amount = amount;
	}
	
	
	

}
