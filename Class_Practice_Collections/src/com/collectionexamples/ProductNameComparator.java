package com.collectionexamples;
import java.util.Comparator;
import com.bean.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		int result =o1.getPname().compareTo(o2.getPname());
		return 0;
	}

}