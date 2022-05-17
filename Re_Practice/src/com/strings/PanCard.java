package com.strings;

import java.util.Scanner;

public class PanCard {
	
	public static int validatePan(String string) {
		//There must be eight characters.
		//First three letters must be alphabets followed by four digit number and ends with alphabet
		//All alphabets should be in capital case.

		if (string.matches("[A-Z]{4}[0-9]{3}[A-Z]{1}")) {
			System.out.println("Valid");
			return 1;
		}
		else System.out.println("Invalid");
			return 2;
		}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter PAN No. :");
		String string1 = scanner.next();
		System.out.println(validatePan(string1));
		
		
	}

}
	
		
