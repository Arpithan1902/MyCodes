
package com.stringexamples;

import java.util.Scanner;

class Exercise2{  
	
	public String getImage(String string) {
		StringBuffer sb1=new StringBuffer(string);
		sb1.append('|');
		StringBuffer sb2=new StringBuffer(string);
		sb2.reverse();
		sb1.append(sb2);
		return sb1.toString();
		
	}
    public static void main(String[] args)
    
    {
   Exercise2 ex=new Exercise2();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter String: ");
	String in=sc.next();
	System.out.println(ex.getImage(in));	
    }
}
    
       
	
