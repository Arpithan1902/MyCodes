package com.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo2 {

	public static void main(String[] args) {

		// ArrayList<Integer> list2=new ArrayList<>();

		ArrayList<String> list = new ArrayList<>();
		list.add("Iphone");
		list.add("Samsung");
		list.add("Oppo");
		
		// list.add(new Integer(10));
		//list.add(10);
		//list.add(10.2); integre type :compiler error

		System.out.println(list);

		Iterator i = list.iterator();
		while (i.hasNext()) {

			String st = (String) i.next();
			System.out.println(st);
		}

	}
}
