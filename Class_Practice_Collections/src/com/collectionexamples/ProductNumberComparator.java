package com.collectionexamples;
import java.util.Comparator;
import com.bean.Product;

public class ProductNumberComparator  implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		int result =o1.getpId()-o2.getpId();
		return 0;
	}
	

}
