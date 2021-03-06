package com.cg.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




	@Entity
	public class Item {
	@Id
		
		private int itemId;
		private String itemName;
		private double itemPrice;
		
		
		@ManyToOne
		private Cart cart;
		
		public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public double getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(double itemPrice) {
			this.itemPrice = itemPrice;
		}
		public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}

}
