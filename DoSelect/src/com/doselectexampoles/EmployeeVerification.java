package com.doselectexampoles;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	public static final String SortMethod = null;
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();
	}

	public boolean isCharacterPresentInAllNames(List<Employee> empList, String string) {
		
		return false;
	}
}

class EmployeeVerification {
	enum SortMethod {
		BYNAME, BYSALARY
	};

	public List<Employee> sort(List<Employee> emps, final SortMethod method) {
		Comparator<Employee> comparator;
		if (method == SortMethod.BYNAME) {
			comparator = Comparator.comparing(Employee::getName);
			System.out.println(comparator);
		} else {
			comparator = Comparator.comparing(Employee::getSalary);
			System.out.println(comparator);
		}
		return emps.stream().sorted(comparator).collect(Collectors.toList());
	}

	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
		long cnt = entities.stream().filter(x -> x.name.startsWith(character)).count();
		if (cnt == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		Employee EI = new Employee();
		List<Employee> empList = null;
		//EI.sort(empList, Employee.SortMethod.BYSALARY);
		boolean result = EI.isCharacterPresentInAllNames(empList, "K");
		System.out.println(empList);
		if (result == true)
			System.out.println("Present");
		else
			System.out.println("Missing");
	}
}
