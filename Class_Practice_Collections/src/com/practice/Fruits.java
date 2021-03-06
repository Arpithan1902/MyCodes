package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruits {
	public static String[] fruitList(List<String> list1, List<String> list2) {

		List<String> list3 = new ArrayList<String>();

		for (int i = 0; i < list1.size(); i++) {
			String str1 = list1.get(i);
			
			
			// string starting with a,g
			if (str1.charAt(0) != 'a' && str1.charAt(0) != 'A' && str1.charAt(0) != 'g' && str1.charAt(0) != 'G')
				list3.add(str1);
		}
		
		
		for (int i = 0; i < list2.size(); i++) {
			String str2 = list2.get(i);
			
			
			// string ending with e,n
			if (str2.charAt(str2.length() - 1) != 'n' && str2.charAt(str2.length() - 1) != 'N'
					&& str2.charAt(str2.length() - 1) != 'E' && str2.charAt(str2.length() - 1) != 'e')
				list3.add(str2);
		}

		Collections.sort(list3);
		String[] str3 = new String[list3.size()];
		for (int i = 0; i < str3.length; i++)
			str3[i] = list3.get(i);
		return str3;
	}

}
