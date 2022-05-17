
package com.regexamples;



public class Pizza {
	private int id;
	private double price;
	private PizzaSize size;
	
	public Pizza(int id, double price, PizzaSize size) {
		this.id = id;
		this.price = price;
		this.size = size;
	}
	
	 public void displayPizza() {
	    	System.out.println("Id: "+id);
	    	System.out.println("price: "+price);
	    	System.out.println("size: "+size);

	    }

}
