package com.strings;

import java.util.Scanner;

public class VowelString {
	
	
		
	public static int testVowels(String string) {
		
		
		if(string.contains("a") || string.contains("A") && 
			string.contains("e") || string.contains("E") && 
			string.contains("i") || string.contains("I") && 
			string.contains("o") || string.contains("O") && 
			string.contains("u") || string.contains("U") ) {
			
			System.out.println("Yes");
			return 1;
		}
		else System.out.println("Invalid");
			return 2;
		}
			

	public static void main(String[] args) 
	{
	
		System.out.println("Enter String");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		
		int result=testVowels(string);
		
		
			}
		}
	


		
	