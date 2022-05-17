package com.stream.bean;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private LocalDate DoJ;
	private String role;
	
	public Employee(int empId, String empName,double salary, String role, LocalDate DoJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.DoJ= DoJ;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public LocalDate getDoJ() {
		return DoJ;
	}
	public void setDoJ(LocalDate doJ) {
		DoJ = doJ;
	}
	
	
	

}
