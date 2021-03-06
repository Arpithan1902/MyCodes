package com.cg.ordercust.main;


import com.cg.ordercust.model.*;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestForCustomerApp {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		
		
		CustomerOrder customer = new CustomerOrder();
		customer.setCustomerName("arpitha");
		customer.setEmail("a@gmail.com");
		customer.setPhone(68278223);
		customer.setAddress("kolar");

		Order order = new Order();
		order.setOrderId(112);
		order.setOrderName("aaaa");
		order.setOrderType("veg");
		order.setOrderDate(LocalDate.now());
		customer.setOrder(order);

		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();

	}

}
