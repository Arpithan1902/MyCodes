package com.collectionslab;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	@SuppressWarnings("rawtypes")
	static void countChars(String inputString) {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);

			} else {
				charCountMap.put(c, 1);

			}
		}
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.print("\n"+entry.getKey()+" "+ entry.getValue());
			//System.out.print( entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Rakesh";
		countChars(str);
	}

}
