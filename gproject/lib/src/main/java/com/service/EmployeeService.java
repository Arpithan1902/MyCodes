package com.service;

import java.util.List;

import com.model.*;

public interface EmployeeService {
	public boolean addEmployee(Employee e);
	public List<Employee>getAllEmployee();
	public int deleteEmployeeById(int empId);
	public Employee getEmployeeById(int empId);
	int updateEmployeeById(int empId);
	
	

}
