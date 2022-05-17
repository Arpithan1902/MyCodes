package com.collectionexamples;

import java.util.*;

public class LinkeListDemo {

	public static void main(String[] args) {

		LinkedList courses = new LinkedList();

		courses.add("java");
		courses.add("html");
		courses.add(null);
		courses.add("javaScript");
		courses.add(3, "html");

		System.out.println(courses);// courses.toString()
		int size = courses.size();
		System.out.println("Size: " + size);

		// how to store primitive?
		// convert primitive into wrapper class object

		ArrayList marks = new ArrayList();
		marks.add(new Integer(58));
		marks.add(new Integer(34));
		marks.add(new Integer(45));
		marks.add(38); // marks.add(new interger(72)) it internally convert like this , called
						// autoboxing

		System.out.println(marks);
		
		Iterator i=marks.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			//String st=(String)obj;
			Integer k=(Integer)obj;
			System.out.println(k);
	}

}
}
