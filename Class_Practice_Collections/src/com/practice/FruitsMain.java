package com.practice;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		list1.add("apple");
		list1.add("orange");
		list1.add("grapes");
		System.out.println(list1);
		
		List<String>list2=new ArrayList<String>();
		list2.add("melon");
		list2.add("apple");
		list2.add("mango");
		System.out.println(list2);
		
		String[] string=Fruits.fruitList(list1,list2);
		for(String string1:string)
			System.out.println(string1);
		}
	}


