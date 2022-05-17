package com.classes;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i=10;					 //primitive type
		Integer j=new Integer(i);  //coverting to reference type //depricated(not recommende) version 
		
		int k=j.intValue(); //unboxing
		
		//java 5 introduced autoboxing
		Integer p1=20;
		int z=p1;
		
		Integer p1=20;   	//internally,Integer p1=new Integer(20); 
		

	}

}
