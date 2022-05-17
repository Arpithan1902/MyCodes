package com.stringexamples;

import java.util.Scanner;
import java.util.StringTokenizer; //it allows u to break the string into token

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter interegers:");
		String in=sc.next();
		
		//using stringtokenizer
		StringTokenizer st=new StringTokenizer(in,",");
		int sum=0;
		
		while(st.hasMoreTokens()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("number is:"+n);
			sum+=n;
			
		}
		System.out.println(sum);
	}

}
