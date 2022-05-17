package com.collectionexamples;
import java.util.*;

public class MapMethodDemo {

	public static void main(String[] args) {
		HashMap<String , String>map=new HashMap<>();
		map.put("India","NewDelhi");
		map.put("UK","London");
		map.put("USA","Washington");
		
		Set<String> allkeys=map.keySet();
		for(String s:allkeys) {
			System.out.println(s);
		}
		Collection<String> allValues= map.values();
		
		for(String s: allValues) {
		System.out.println(s);

	}

}
}
