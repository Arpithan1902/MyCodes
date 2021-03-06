package com.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "aaaa", 1, "active", 20000);
		Employee emp2 = new Employee(102, "bbb", 2, "active", 20000);
		Employee emp3 = new Employee(103, "ccc", 3, "active", 20000);
		Employee emp4 = new Employee(104, "ddd", 4, "active", 20000);
		Employee emp5 = new Employee(105, "eee", 5, "active", 20000);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp5);
		employees.add(emp4);
		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp1);
		


		//Write a method to print employee details working in each department
		
		System.out.println("Employees working in each dept");
		Map<Integer, Long> getEmpByDeptId = employees.stream().collect(Collectors.groupingBy(Employee::getDeptId,
				TreeMap::new, Collectors.counting()));
		getEmpByDeptId.forEach((deptId,count)->System.out.printf("",deptId,count));
		
		
}
	}
