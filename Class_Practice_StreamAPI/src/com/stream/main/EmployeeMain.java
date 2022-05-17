package com.stream.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.stream.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Arpitha", 50000, "developer", LocalDate.of(2010, 10, 20));
		Employee emp2 = new Employee(102, "Aaa", 50000, "lead", LocalDate.of(2013, 10, 20));
		Employee emp3 = new Employee(103, "Appptha", 50000, "develope", LocalDate.of(2014, 10, 20));
		Employee emp4 = new Employee(104, "Aaatha", 50000, "develope", LocalDate.of(2015, 10, 20));

		List<Employee> employees = new ArrayList<>();
		employees.add(emp4);
		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp1);

		List<Employee> developers = new ArrayList<>();
		// System.out.println(developers.size()); // initial size is 0

		Iterator<Employee> i = employees.iterator();

		while (i.hasNext()) {
			Employee emp = i.next();
			if (emp.getRole().equals("developer")) {
				developers.add(emp); // adding/getting developers from employees
			}

			Iterator<Employee> i1 = developers.iterator();
			while (i1.hasNext()) {
				Employee e = i1.next();
				System.out.println(e.getEmpId());
				System.out.println(e.getEmpName());
				System.out.println(e.getSalary());
				System.out.println(e.getDoJ());
				System.out.println(e.getRole());
			}

		}
	}
}
