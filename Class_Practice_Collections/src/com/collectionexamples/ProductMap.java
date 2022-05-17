package com.collectionexamples;

import java.util.*;
import com.bean.*;

public class ProductMap {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setpId(10);
		p1.setPname("Phone");
		p1.setpPrice(200);
		p1.setCategory("Mobile");

		Product p2 = new Product();
		p2.setpId(11);
		p2.setPname("samsung");
		p2.setpPrice(300);
		p2.setCategory("tv");

		Product p3 = new Product();
		p3.setpId(12);
		p3.setPname("dell");
		p3.setpPrice(1000);
		p3.setCategory("Laptop");

		Product p4 = new Product();
		p4.setpId(12);
		p4.setPname("dell");
		p4.setpPrice(1000);
		p4.setCategory("Laptop");

		Map<Integer, Product> map = new HashMap<>();
		map.put(p1.getpId(), p1);
		map.put(p2.getpId(), p2);
		// map.put(p1.getPname(), p1);
		map.put(p3.getpId(), p3);
		
		int productKey=10;

		Product product = map.get(productKey);
		if (product != null) {
			System.out.println(product.getpId());
			System.out.println(product.getPname());
			System.out.println(product.getpPrice());
			System.out.println(product.getCategory());
		} else {
			System.out.println("Products not existing with key:");
		}
	}
}
