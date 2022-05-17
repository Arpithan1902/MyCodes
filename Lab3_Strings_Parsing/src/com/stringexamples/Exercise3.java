package com.stringexamples;

import java.util.Scanner;

public class Exercise3 {

	public String alterStrings(String str) 
		{
		StringBuffer sbr=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			char c=sbr.charAt(i);
			
			if(!(c=='A'||c=='a'||c=='e'||c=='E'||c=='I'||c=='i'||c=='O'||c=='o'||c=='u'||c=='U')) {
				sbr.replace(i, i+1, String.valueOf((char)(c+1)));
				
			}
		}
			
		return sbr.toString();
		}
	
	

	public static void main(String[] args) {
	    
	   Exercise3 ex=new Exercise3();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter String: ");
		String in=sc.next();
		System.out.println(ex.alterStrings(in));	
	    }
	}
	