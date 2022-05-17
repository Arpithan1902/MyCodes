package com.labexamples;

import java.util.Scanner;

public class Exercise3 {
	static int fib(int number) {
		if (number <= 1)
			return number;
		return fib(number - 1) + fib(number - 2);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number:");
		num = sc.nextInt();
		System.out.println(fib(num));
	}
}
