package com.servicepack;

public interface CustomerService {



	boolean login(String userName, String password);
//	void display();
	default void show()
	{
		System.out.println("Hi");
	}

}