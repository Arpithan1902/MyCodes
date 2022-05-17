package com.servicepack;

public interface EmployeeService {
	String generatePassword(String userName,long phone);
//	void display();
	default void show()
	{
		System.out.println("Hi");
	}

}


