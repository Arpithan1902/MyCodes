package com.capgeminidb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		
		Employee emp=new Employee();
		emp.setDesignation("Analyst");
		emp.setEmpId(101);
		emp.setEmpName("Arpitha");
		emp.setSalary(25000);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		System.out.println("Data inserted Successfully");

		
	}
}
