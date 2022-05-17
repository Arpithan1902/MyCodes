package com.collectionexamples;

import java.util.*;
public class SetDemo {
	
	public static void main(String args[]) {
		
	//HashSet courses=new HashSet(); //unoredered and unsorted
	//LinkedHashSet courses=new LinkedHashSet();
	TreeSet courses=new TreeSet();
	courses.add("java");
	courses.add("html");
	//courses.add(null);
	courses.add("javaScript");
	//courses.add("html");//copy is not allowed
	
	System.out.println(courses);
	
	}

}
