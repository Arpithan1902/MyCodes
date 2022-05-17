package com.collectionexamples;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> map=new HashMap<>();
		// LinkedHashMap<String, String> map=new LinkedHashMap<>();  //ordered which maintains insertion order
		//TreeMap<String, String> map = new TreeMap<>();
		
		//Hashtable<String, String> map=new Hashtable<>();  //similar to hashmap but null values are not allowed

		
		map.put("India", "NewDelhi");
		map.put("UK", "London");
		map.put("USA", "Washington");
		map.put("Uk", "London");
		map.put(null, null);
		map.put("pak", null);

		System.out.println(map);

		String cName = "India"; // If u know thw key u can get vLUE
		String cap = map.get(cName);
		if (cap != null) {
			System.out.println(cap);

		} else {
			System.out.println("No country Found");

		}

	}

}
