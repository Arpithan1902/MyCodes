package com.labexamples;

import java.util.Scanner;

public class Exercise6 {
	private int sum, sqsum;

	public int calculateDifference(int n) {
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		sum = sum * sum;
		for (int i = 1; i <= n; i++) {
			sqsum = sqsum + (i * i);
		}
		return sqsum - sum;
	}

	public static void main(String args[]) {
		Exercise6 ex = new Exercise6();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		System.out.println(ex.calculateDifference(n));
	}

}
