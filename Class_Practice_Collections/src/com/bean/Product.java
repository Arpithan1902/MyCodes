package com.bean;

import java.util.Objects;

public class Product implements Comparable<Product>{
	
	
	private int pId;
	private String pname;
	private double pPrice;
	private String Category;
	
	public Product() {
		
	}
	public Product(int productId, String productName, double productPrice, String category) {
		super();
		this.pId = productId;
		this.pname = productName;
		this.pPrice = productPrice;
		this.Category = category;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Category, pId, pPrice, pname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Category, other.Category) && pId == other.pId
				&& Double.doubleToLongBits(pPrice) == Double.doubleToLongBits(other.pPrice)
				&& Objects.equals(pname, other.pname);
	}
	
	@Override
	public int compareTo(Product o) {

		//int result = this.productId-o.getProductId();	

		int result = (int) (this.pPrice-o.getpPrice());
		if(result == 0) {
			result = this.getPname().compareTo(o.getPname());
		}		
		//int result = this.category.compareTo(o.getCategory());
		return result;
}
}
