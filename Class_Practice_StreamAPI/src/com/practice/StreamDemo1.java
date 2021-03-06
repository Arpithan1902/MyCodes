package com.practice;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

	public class StreamDemo1 {
		
		
		private static Stream<Integer> changeIntoStream(ArrayList<Integer> list) 
		{
			Stream<Integer> s=list.stream();
			return s;
		}
		
		
		public static Set<Integer> filterNumbersIntoSet(List<Integer> list)
		{
			Set<Integer> set1=list.stream().filter(i->i>=35).map(i->i).collect(Collectors.toSet());
			return set1;	
		
		}
		public static void main(String[] args) {
			
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(10);
			list.add(20);
			list.add(80);
			list.add(55);
			list.add(46);
			System.out.println(list);
			
			Stream<Integer> s=changeIntoStream(list);
			s.forEach(n->System.out.println(n));
			
			Set<Integer>set1=filterNumbersIntoSet(list);
			set1.forEach(i->System.out.println(i));
			
			
		
	}

		
}
		
		
		
		
			