package com.assignments;

import java.util.Scanner;

public class Employee {
	private int empID;
	private String empName;
	private String empAdress;
	long empPhone;
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String generatePassword(String empName,long empPhone) {
		//super();
		this.empName=empName;
		this.empPhone=empPhone;
		return empName;
	}


	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name ");
		String input=sc.next();
		System.out.println("Enter ur nd phone number");
		long input2=sc.nextLong();
			{
			}
		}
		}
