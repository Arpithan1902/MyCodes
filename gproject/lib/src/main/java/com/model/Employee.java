package com.model;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private long phnNo;
	
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, double salary, long phnNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.phnNo = phnNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}

}
