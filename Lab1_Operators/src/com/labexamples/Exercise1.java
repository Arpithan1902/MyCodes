package com.labexamples;

public class Exercise1 {

	public static void main(String[] args) {
		int num=15;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
