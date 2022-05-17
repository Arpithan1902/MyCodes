package com.main;

import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeServiceImpl;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		
		
//		int nOE = Integer.parseInt(scanner.nextLine());
//		for (int i = 0; i < nOE; i++) {
//			Employee e = new Employee();
//			System.out.println("Enter id");
//			int id = Integer.parseInt(scanner.nextLine());
//			System.out.println("Enter name");
//			String eName = scanner.nextLine();
//			System.out.println("Enter salary");
//			double salary = Double.parseDouble(scanner.nextLine());
//			System.out.println("Enter phone");
//			long phone = Long.parseLong(scanner.nextLine());
//			e.setEmpId(id);
//			e.setEmpName(eName);
//			e.setPhnNo(phone);
//			e.setSalary(salary);
//			if (service.addEmployee(e)) {
//				System.out.println("\n"+ i + 1 + " " + "object inserted");
//			}
//
//		}

		 //calling getAllEmployee()
		List<Employee> listOfEmp = service.getAllEmployee();
		for (Employee e : listOfEmp) {

			System.out.println(e.getEmpId() +  " " + e.getEmpName() + " " + e.getSalary()+" " + e.getPhnNo() );
		}
			//deleting 
//		System.out.println("\nDelete employee object based on id:");
//		int id = Integer.parseInt(scanner.nextLine());
//		int k = service.deleteEmployeeById(id);
//		if (k > 0) {
//		System.out.println("Successfully Deleted");
//		}
		
		System.out.println("\nUpdate employee object based on id");
		int updateId= Integer.parseInt(scanner.nextLine());
		
		
		if(service.updateEmployeeById(updateId)==1) {
		Employee e1=service.getEmployeeById(updateId);
		System.out.println(e1.getEmpId() +  " " + e1.getEmpName() + " " + e1.getSalary()+" " + e1.getPhnNo() );
		
		System.out.println("Succesfully Updated");
		}

	}
}

