package com.classes;

public class ThrowsDemo {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		
		try {
			div(a,b);		
		}
	
	
	catch(ArithmeticException e) {
		System.out.println("denominator shld not be zero");
		
	}
	
	
	System.out.println("main ends");
	}


static void div(int a,int b) throws ArithmeticException{
	int c=a/b;
	System.out.println("Result: "+c);
}
}


