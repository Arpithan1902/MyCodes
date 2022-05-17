package com.collectionexamples;
import com.bean.Product;
import java.util.*;

public class ProductListDemo1 {

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setpId(10);
		p1.setPname("Phone");
		p1.setpPrice(200);
		p1.setCategory("Mobile");
		
		Product p2=new Product();
		p2.setpId(11);
		p2.setPname("samsung");
		p2.setpPrice(300);
		p2.setCategory("tv");
		
		Product p3=new Product();
		p3.setpId(12);
		p3.setPname("dell");
		p3.setpPrice(1000);
		p3.setCategory("Laptop");
		
		Product p4=new Product();
		p4.setpId(12);
		p4.setPname("dell");
		p4.setpPrice(1000);
		p4.setCategory("Laptop");
		
		//ArrayList<Product> products=new ArrayList<>(); //allow duplicate
		HashSet<Product> products=new HashSet<>(); //not allow
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p2);  //duplicates are not allowed
		
		
		Iterator<Product> i=products.iterator();
		
		while(i.hasNext()) {
			Product p=i.next();
			System.out.print("\n ID: "+ p.getpId());
			System.out.print("\t Name: "+p.getPname());
			System.out.print(" \t Price: "+p.getpPrice());
			System.out.print(" \t category: "+p.getCategory());
			
		}
		
		
	}

}
