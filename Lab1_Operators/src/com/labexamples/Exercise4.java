package com.labexamples;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String args[]) {
		int p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print prime number upto that number:");
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < 1; j++) {
				if (i % j == 0)
					p = 1;

			}
			if (p == 0)
				System.out.print(" "+i);
		}
	}

}

