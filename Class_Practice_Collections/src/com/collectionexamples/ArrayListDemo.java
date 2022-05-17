package com.collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList courses=new ArrayList();
		courses.add("java");
		courses.add("html");
		courses.add(null);
		courses.add("javaScript");
		courses.add("html");
		
		
		System.out.println(courses);
		
		for(Object obj:courses) {
			String st=(String) obj;
			System.out.println(st);
			
		}
		
		
		//courses.toString()
		int size=courses.size();
		System.out.println("Size: "+size);
		
		
		
		//how to Traverse---
		//1.Traversing using iterator 
		//2.for-each loop
			
		int k=0;
		Iterator i=courses.iterator();
			while(i.hasNext()) {
				Object obj=i.next();
				String st=(String) obj;
				System.out.println(st);
				
				
				if(st.equals("html")) {
					System.out.println("Found at:  "+k);
					
	
					
					
				}
				k++;
				
				//i.remove();
				
				
			}
			System.out.println("java 8 for each");
			courses.forEach(x->System.out.println(x));
			
	}

}
