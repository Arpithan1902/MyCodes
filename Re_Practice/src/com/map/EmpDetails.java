package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class EmpDetails {
	private int empId;
	private String Designation; 
	private int salary;
	
	
	public EmpDetails(int empId, String designation, int salary) {
		super();
		this.empId = empId;
		this.Designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return Designation;
	}
	public String setDesignation(String designation) {
		return Designation = designation;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

		public static void main(String[] args) {
			
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(101, "Manager");
		hashmap.put(102, "Programmer");
		hashmap.put(103, "Analyst");
		System.out.println(hashmap);
		
		HashMap<Integer,Integer> hashmap2=new HashMap<>();
		hashmap2.put(101, 50000);
		hashmap2.put(102, 40000);
		hashmap2.put(103, 30000);
		System.out.println(hashmap2);
		
		int empId = 101; // If u know thw key u can get vLUE
		String design = hashmap.get(empId);
		if (design != null) {
			System.out.println(design);

		} else {
			System.out.println("not found");
		
		}
		
		Set<Integer> allkeys=hashmap.keySet();
		for(Integer s:allkeys) {
			System.out.println(s);
		}
		Collection<String> allValues= hashmap.values();
		
		for(String s: allValues) {
		System.out.println(s);
		
		}
	}
}
		

	


