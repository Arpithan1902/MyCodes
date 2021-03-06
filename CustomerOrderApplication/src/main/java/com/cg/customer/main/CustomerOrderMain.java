package com.cg.customer.main;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.customer.entity.*;

public class CustomerOrderMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();

		Cart cart = new Cart();

		Item item1 = new Item();
		item1.setItemId(31223);
		item1.setItemName("mobilesss");
		item1.setItemPrice(340000.00);
		item1.setCart(cart);
		
		cart.addItem(item1);

		Item item2 = new Item();
		item2.setItemId(32323);
		item2.setItemName("Laptopssss");
		item2.setItemPrice(64000.00);
		item2.setCart(cart);
		
		cart.addItem(item2);

		Customer customer = new Customer();
		customer.setCustomerName("Arpithansgr");
		customer.setEmail("arpinsgr@gmail.com");
		customer.setPhone(789255);
		customer.setCustomerAddress("Kolardistict");

		Order order = new Order();
		order.setOrderId(13223);
		order.setOrderName("biriyanisss");
		order.setOrderType("nn.vegsss");
		order.setOrderDate(LocalDate.now());

		customer.setOrder(order);

//		Address address = new Address();
//		address.setCity("Kolar");
//		address.setCountry("IN");
//		address.setPinCode("563133");
//		address.setState("KA");
//		
//		customer.setAddress(address);

		em.getTransaction().begin();
		em.persist(cart);
		em.persist(customer);
		em.getTransaction().commit();

	}

}
