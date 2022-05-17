package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;
import com.utilility.EmployeeUtility;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean addEmployee(Employee e)  {
	
		int status=0;
		try
		{
		Connection con=EmployeeUtility.getConnect();
		final String INSERT_EMP="insert into employee_table values(?,?,?,?)";
	PreparedStatement ps=	con.prepareStatement(INSERT_EMP);
	ps.setInt(1,e.getEmpId());
	ps.setString(2, e.getEmpName());
	ps.setDouble(3, e.getSalary());
	ps.setLong(4, e.getPhnNo());
	
	status=ps.executeUpdate();
	
	
		
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		if(status==1)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		List<Employee> listOfEmp=new ArrayList<Employee>();
 try
 {
	
		Connection con=EmployeeUtility.getConnect();
		System.out.println();
		PreparedStatement ps=con.prepareStatement("select * from employee_table");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("empId");
			String name=rs.getString("empName");
			double salary=rs.getDouble("salary");
			long phone=rs.getLong(4);
			Employee e=new Employee();
			e.setEmpId(id);
			e.setEmpName(name);
            e.setSalary(salary);
            e.setPhnNo(phone);
            listOfEmp.add(e);
			
		}
		
		
 }catch(Exception e)
 {
	 System.out.println(e);
 }

		if(listOfEmp.isEmpty())
		{
			return null;
		}
		return listOfEmp;
	}

	@Override
	public int deleteEmployeeById(int empId) {
		int delStatus=0;
		try
		 {
			
				Connection con=EmployeeUtility.getConnect();
				PreparedStatement ps=con.prepareStatement("delete from employee_table where empid=?");
		ps.setInt(1, empId);
	delStatus=	ps.executeUpdate();
		 }catch(Exception e)
		{
			 System.out.println(e);
		}
		
		return delStatus;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int updateEmployeeById(int empId) {
		
		       int updateStatus=0;
		       
		try
		{
			Connection con=EmployeeUtility.getConnect();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your updated salary");
			double salary=Double.parseDouble(sc.nextLine());
			System.out.println("Enter your updated phone");
			long phnNo=Long.parseLong(sc.nextLine());
				
				PreparedStatement ps=con.prepareStatement("Update employee_table set salary=?,phnNo=? where empId=?");
				
				ps.setDouble(1, salary);
				ps.setLong(2, phnNo);
				ps.setInt(3, empId);
				updateStatus= ps.executeUpdate();
		 }catch(Exception e)
		{
			 System.out.println(e);
		}
		return updateStatus;
	}

	
	}



