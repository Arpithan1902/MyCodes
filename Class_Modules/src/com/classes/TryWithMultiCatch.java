package com.classes;

public class TryWithMultiCatch {

	public static void main(String[] args) {
		System.out.println("main starts....");
		
		try {
		int a=Integer.parseInt(args[0]); //convert string into integer
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("Rseult:"+c);
		
		}
		
		catch(ArithmeticException e) {
		System.out.println("ArithmeticException ....");
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException....");	
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ....");
			}
		
		System.out.println("main ends....");
		
	}
}
