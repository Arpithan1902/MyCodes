package com.collectionslab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercise5 {
	public int getSecondSmallest(int[] arr) {
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : arr) {
			intList.add(i);
		}
		Collections.sort(intList);
		return intList.get(1);
	}

	public static void main(String[] args) {
		Exercise5 ex = new Exercise5();

		int arr[] = { 1,2,3,5 };
		int i = ex.getSecondSmallest(arr);
		System.out.println("Second Smallest element in the given array is: " + i);
	}
}