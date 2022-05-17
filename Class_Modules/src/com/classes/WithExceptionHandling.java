package com.classes;

public class WithExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		
		int a=20;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println("result"+c);
			}
		
		catch(ArithmeticException e) { //it executes only if it there any exception otherwise try block will excute
			//System.out.println("denominator shld not be zero");
			System.out.println(e.getMessage());
			}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			//System.out.println(e.getMessage());
		}
		
		
		finally {
			
		}
		System.out.println("main ends");

	}

}
