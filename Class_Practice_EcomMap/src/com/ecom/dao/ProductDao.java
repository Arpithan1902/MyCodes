package com.ecom.dao;

import java.util.Iterator;
import java.util.List;

import com.ecom.bean.Product;

public class ProductDao {

	private List<Product> products;

	public ProductDao() {

		Product product1 = new Product(10, "Iphone", 10000, "Mobile");
//		product1.setpId(10);
//		product1.setpName("Ipgone");
//		product1.setpPrice(10000);
//		product1.setCategory("Mobile");

		Product product2 = new Product(20, "Iphoe", 20000, "Lap");
//		product2.setpId(20);
//		product2.setpName("Honda");
//		product2.setpPrice(20000);
//		product2.setCategory("Bike");

		Product product3 = new Product(30, "Iphon", 90000, "Moble");
//		product3.setpId(30);
//		product3.setpName("Lenovo");
//		product3.setpPrice(12000);
//		product3.setCategory("Laptop");

		Product product4 = new Product(40, "phone", 1000, "Moile");
//		product4.setpId(40);
//		product4.setpName("Samsung");
//		product4.setpPrice(11900);
//		product4.setCategory("TV");
//
//		products.add(product4);
//		products.add(product3);
//		products.add(product2);
//		products.add(product1);
	}

	public Product getpById(int pId) {
		Product product = null;

		Iterator<Product> i = products.iterator();

		while (i.hasNext()) {

			Product p = i.next();
			if (pId == p.getpId()) {
				product = p;
				return product;
			}
		}
		return product;
	}

}
