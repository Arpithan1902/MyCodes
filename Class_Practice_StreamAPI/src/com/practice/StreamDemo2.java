package com.practice;

import java.util.HashMap;

public class StreamDemo2 {
	
	public static int countNumberOfLocation(HashMap<Integer, String> emp) 
	{
		int a = (int)emp.values().stream().distinct().count();
		return a;

	}

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Kolar");

		map.put(2, "Mysore");

		map.put(3, "Banglore");

		map.put(4, "Mandya");

		System.out.println(countNumberOfLocation(map));

	}
}
