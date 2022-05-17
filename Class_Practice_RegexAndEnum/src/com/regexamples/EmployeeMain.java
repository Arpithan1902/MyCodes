package com.regexamples;
import com.regexamples.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee(111,"ravi",50000);
		Employee emp2=new Employee(112,"ravi",50000);
		
		if(emp1.equals(emp2)) {
			System.out.println("Equals");
		}
		else
		{
			System.out.println("not euqal");
		}
	}

}
