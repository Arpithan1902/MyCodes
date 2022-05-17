package com.ecom.controller;

import com.ecom.bean.Order;
import com.ecom.bean.Product;
import com.ecom.service.ProductService;

public class OrderController {
	
	public void placeOrder(int pId,int qntty) {
		
		ProductService pS=new ProductService();
		
		Order order=pS.addOrder(pId, qntty);
		
		
		if(order!=null) {
			System.out.println("Order placed successfully");
			System.out.println("Order Details:");
			System.out.println("Oder Id: "+order.getOrderId());
			System.out.println("Oder Amount: "+order.getOrderAmount());
			System.out.println("Oder Date: "+order.getDateOfOrder());
			System.out.println("Product Id: "+order.getpId());
			
		}
		else {
			System.out.println("Oder Id is not available ");
			
		}
		
	}

}
