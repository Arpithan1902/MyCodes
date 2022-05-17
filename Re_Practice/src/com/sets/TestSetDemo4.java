package com.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo4 {
	public static void main(String args[]) {
		Set<Integer> set1=new HashSet();
		set1.add(1);
		set1.add(30);
		set1.add(23);
		set1.add(44);
		System.out.println(set1);
		Set<Integer> set2=new HashSet();
		set2.add(1);
		set2.add(3);
		set2.add(43);
		set2.add(44);
		
		//set1.addAll(set2); //merger both sets
		
		//set1.removeAll(set);//remove duplicates value
		set1.retainAll(set2); //return common elements
		for(Integer i:set1)
		{
			System.out.println(i);
		}
		
		
	}

}
