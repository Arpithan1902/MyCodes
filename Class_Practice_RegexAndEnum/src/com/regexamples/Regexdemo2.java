package com.regexamples;

import java.util.regex.Pattern;

public class Regexdemo2 {

	public static void main(String[] args) {
		
		boolean result1=Pattern.matches("[amn]", "am");//we should match only one characater not two
		System.out.println(result1);
		
		boolean result=Pattern.matches("[a-zA-z]", "$");//ONLY ALPHABETS, even only one character it will match
		System.out.println(result);	
		
		boolean result2=Pattern.matches("[a-zA-z]+", "hafag");//ONLY ALPHABETS, more character it will match
		System.out.println(result2);
		
		boolean result3=Pattern.matches("[a-zA-z]{5}", "hthjsh"); //only 5 characters not more or less
		System.out.println(result3);
		
		boolean result4=Pattern.matches("[a-zA-z0-9_@#]{5}", "h#9@_"); //only 5 not more or less,Space is not allowed
		System.out.println(result4);
		
		boolean result5=Pattern.matches("[a-zA-z]{5,10}", "tjkkkkkkkkkkksh");//minimum character should 5,maxm shld 10
		System.out.println(result5);
	}

}
