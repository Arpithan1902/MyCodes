package com.collectionslab;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class Exercise1 {

	// function to sort HashMap by values
	public static HashMap<String, Integer> getValues(HashMap<String, Integer> map)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list =
			new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// put data from sorted list to HashMap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	// Driver Code
	public static void main(String[] args)
	{

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// enter data into HashMap
		map.put("Chetan", 15);
		map.put("Arpitha", 24);
		map.put("Rakesh", 25);
		map.put("Vinu", 22);
		map.put("Manu", 20);
		map.put("Kavan", 19);
		
		Map<String, Integer> map1 = getValues(map);

		// print the sorted HashMap
		for (Map.Entry<String, Integer> en : map1.entrySet()) {
			System.out.println( en.getKey() +"= " + en.getValue());
		}
	}
}
