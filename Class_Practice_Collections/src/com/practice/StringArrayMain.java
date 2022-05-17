package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayMain {
	public static void main(String[] args) {
		System.out.println("Enter Inputs:");
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<String> arylist=new ArrayList<String>();
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			arylist.add(scanner.next());
		}
		
		String str[]=StringArray.convertToStringArray(arylist);
		for(int i=0;i<str.length;i++) {
			System.out.println("Output: "+str[i]);
		}
		
	}

}
