package com.practice;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		
		Customer customer=new Customer();
		customer.setCustomerId(2);
		customer.setCustomerName("aaaa");
		customer.setEmail("abcaaa@gmail.com");
		customer.setCustomerPhone(123334);
		
		Address address=new Address();
		address.setAdressId(4);
		address.setCity("aaar");
		address.setState("bbbb");
		address.setPincode(1258);
		address.setStreetName("ccc");
		address.setCountry("Idd");
		
		customer.setAddress(address);
		
		
		
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		
		System.out.println("Data inserted Successfully");
		
		//getCustomerById
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Customer:");
		int id = Integer.parseInt(sc.nextLine());

		Customer customer1= em.find(Customer.class, id);

		System.out.println(customer1.getCustomerId()+" "+customer1.getCustomerName()+" "+customer1.getEmail()+" "+customer1.getCustomerPhone()+" "+customer1.getAddress());
	}

}
