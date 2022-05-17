package com.arrayexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercise1 {
	public int getSecondSmallest(int[] arr) {
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : arr) {
			intList.add(i);
		}
		Collections.sort(intList);
		return intList.get(1);
	}

	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();

		int arr[] = { 43, 54, 65, 76, 32, 76, 87, 43, 66, 8, 7, 32, 54, 43 };
		int i = ex.getSecondSmallest(arr);
		System.out.println("Second Smallest element in the given array is: " + i);
	}
}