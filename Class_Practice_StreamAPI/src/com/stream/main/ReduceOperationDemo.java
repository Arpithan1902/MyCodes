package com.stream.main;

import java.util.Arrays;

public class ReduceOperationDemo {

	public static void main(String args[]) {
		Integer[] nums= {10,20,30,50};
		
		//sum of all the element inside array
		
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		System.out.println("sum:"+sum);
		
		//using Stream API
		//Optional<Integer> optional=A
		Arrays.stream(nums).reduce((a,b)->a+b);
		
		
		}

	}


