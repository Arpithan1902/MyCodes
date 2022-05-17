package com.classes;

import java.util.Scanner;

public class ScannerDateTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter EmpNum: ");
		int eNum=sc.nextInt();
		
		System.out.println("Enter Emp name: ");
		String eName=sc.next();
		
		System.out.println("Enter emp Salry:" );
		double eSal=sc.nextDouble();
		
		
		System.out.println("EmpNum: "+eNum);
		System.out.println("Emp Name: "+eName);
		System.out.println("Emp sal: "+eSal);
		
		

	}

}
