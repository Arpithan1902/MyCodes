package com.classes;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 		//system.in because we r reading input from keyboard
		
		System.out.println("Enter EmpNum: ");
		int eNum=sc.nextInt();
		
		System.out.println("Enter Emp name: ");
		String eName=sc.next();
		
		System.out.println("Enter emp Salry:" );
		double eSal=sc.nextDouble();
		
		sc.close();
		
		System.out.println("EmpNum: "+eNum);
		System.out.println("Emp Name: "+eName);
		System.out.println("Emp sal: "+eSal);
		
		

	}

}
