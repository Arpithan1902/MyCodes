package com.doselectexampoles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity {
	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}

public class HandlingStuff {
	public String handleException(Activity a) {
		String string;
		try {
			if (a.string1.equals(null) || a.string2.equals(null)) {
				throw new NullPointerException("Null values found");
			} else if (!(a.operator.equals("+")) && !(a.operator.equals("-"))) {
				throw new Exception("Default exception" + a.operator);
			}
		} catch (NullPointerException ex) {
			string = "Null values found";
			return string;
		} catch (Exception e) {
			string = "Default Exception" + a.operator;
			return string;
		}
		return "No Exception Found";
	}

	public String doOperation(Activity a) {

		String result = new String();
		switch (a.operator) {
		case "+": {
			result = a.string1.concat(a.string2);
			return result;
		}
		case "-": {
			String regex = a.string2;
			result = a.string1.replaceAll(regex, "");
			return result;
		}
		}
		return result;
	}

	public static void main(String args[]) throws Exception {
		HandlingStuff source = new HandlingStuff();
		Activity activity = new Activity("Helloworld", "world", "+");
		source.handleException(activity);
		source.doOperation(activity);
	}
}
