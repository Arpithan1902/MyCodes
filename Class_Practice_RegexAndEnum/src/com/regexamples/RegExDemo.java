package com.regexamples;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String args[]) {
		String input="#ss";
		
		Pattern p=Pattern.compile("..s"); //dot(.) means any character
		Matcher m=p.matcher(input);
		boolean result=m.matches();
		System.out.println(result);
		
		boolean b=Pattern.matches(".s",input);//2nd way
		System.out.println(b);
		
		
	}

}
