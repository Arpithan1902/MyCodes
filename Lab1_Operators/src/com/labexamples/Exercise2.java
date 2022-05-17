package com.labexamples;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		{
			
			System.out.println(" 1.Red\n 2.Yellow\n 3.Green");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
					
		}
		switch(ch)
			{
			case 1:
				System.out.println("\t STOP");
				break;
			case 2:
				System.out.println("\t WAIT");
				break;
			case 3:
				System.out.println("\t GO");
				break;
			default:
				System.out.println("\t Invalid Choice");
					
			}

	}

}
