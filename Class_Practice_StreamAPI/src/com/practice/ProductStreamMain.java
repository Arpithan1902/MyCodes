package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ProductStreamMain {
	
		
		
		enum SortMethod
		{
			BYPRICE,BYNAME
		}
		
		public static double getTotalCost(List<ProductStreamMain> product)
		{
			return product.stream().mapToDouble(Product :: getpCost).sum();
		}
		
		public static Set<Product> getAllProduct(List<Product> product)
		{
		return product.stream().filter(m->m.getpCost()>5000.00).map(n->n).collect(Collectors.toSet());
		}t
		
		
		//public Stream<Product> sortProduct(List<Product> listOfProduct,sortMethod sortBy)
		{
			
		}
		
		
		
		public static void main(String[] args)
		{
			Product p1 = new Product("Laptop",20000);
			Product p2 = new Product("Tv",30000);
			Product p3 = new Product("Mobile",15000);
			Product p4 = new Product("phone",8000);
			
			List<ProductStreamMain> product = new ArrayList<>();
			
			product.add(p3);
			product.add(p2);
			product.add(p1);
		    getAllProduct(product).forEach(x->System.out.println(x.getpCost()));
		    System.out.println("Total cost :  "+getTotalCost(product));
		    
			
		}

	}
}
