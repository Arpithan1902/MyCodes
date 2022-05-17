package com.collectionexamples;
import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList courses=new ArrayList();
		courses.add("java");
		courses.add("html");
		courses.add(null);
		courses.add("javaScript");
		courses.add(3,"html");
		
		
		courses.remove(1);//index value
		
		System.out.println(courses);
		
		boolean result=courses.contains("java");
		System.out.println("Is available?   "+result);
		

	}

}
