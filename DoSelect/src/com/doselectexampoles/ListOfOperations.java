package com.doselectexampoles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayListOps {

  	private static final Integer[] List = null;

	public static ArrayList<Integer> makeArrayListInt(int n)
	  {
		  ArrayList<Integer> list = new ArrayList<>();
		 
		  for(int i=0;i<n;i++){
			  list.add(0);
			}
			return list;
		}	
	//   ArrayList<Integer>list=new ArrayList<>();
	//   for(Integer integer:ary){
	// 	  list.add(Integer);
	//   }
	//   return list;
    

	public static ArrayList<Integer> reverseList(ArrayList<Integer> list){
		// for(int k=0,j=list.size()-1;k<j;k++){
		// 	list.add(k,list.remove(j));
		Collections.reverse(list);
		return list;
	}

	@SuppressWarnings("null")
	public static ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		ArrayList<Integer> list1 = null;
		// int index=list.indexOf(m);
		// list.set(index.n);
		//ArrayList<Integer>list=new ArrayList<>();
		for(Integer i:List){
			if(i==m)
			list1.add(n);
			else
			list1.add(i);
		}
		return list1;
	}


}
public class ListOfOperations{
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
		ArrayListOps obj=new ArrayListOps();
		@SuppressWarnings("static-access")
		ArrayList<Integer>list1 =obj.makeArrayListInt(4);
		@SuppressWarnings("static-access")
		ArrayList<Integer>list2=obj.reverseList(list);
		@SuppressWarnings("static-access")
		ArrayList<Integer>list3=obj.changeList(list2,28,20);
		//ArrayListOps.changeList(list,100,10);c
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		

	}
}