package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class StringArray {
	public static String[] convertToStringArray(ArrayList<String>arylist) {
		Collections.sort(arylist);
		
		String[] string=new String[arylist.size()];
		arylist.toArray(string);
		return string;
		
		
	}

}
