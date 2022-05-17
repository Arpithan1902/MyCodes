package com.classes;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Mian starts....");
		
		int x=-10;
		
		
		try {
			test(x);
		}
		
		
		catch(NegativeNumberException ex) {
			
			String msg=ex.getMessage();
			System.out.println(msg);
	}
		
		
		System.out.println("Main ends....");
	}
	
	
	static void test(int x) throws NegativeNumberException { //checked exception
		
		
		if(x<0) {
		NegativeNumberException ex=new NegativeNumberException("Negative Numbers not allowed");
		throw ex;
		}
			System.out.println("Answer is:"+x);
	}

}
