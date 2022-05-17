package com.stream.main;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("SQL");
		
		Stream<String> stream=list.stream(); //get stream obj from collection
		stream.forEach(x->System.out.println(x));
		
		int[] arys=new int[5];	//data source
		arys[0]=20;
		arys[1]=30;
		arys[2]=35;
		arys[3]=45;
		arys[4]=10;
				
		IntStream arystream=Arrays.stream(arys); //get stream obj from array
		
		arystream.filter(x->x>20).forEach(x->System.out.println(x));
		
		//arystream.forEach(s->System.out.println(s));

	}

}
