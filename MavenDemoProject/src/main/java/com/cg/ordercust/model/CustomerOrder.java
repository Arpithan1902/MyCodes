package com.cg.ordercust.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity

public class CustomerOrder {


	@Id
	@SequenceGenerator(name = "abc",initialValue = 100,allocationSize = 5)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column(name = "cust_name")
	private String customerName;
	@Column(name = "cust_phone", unique = true, nullable = false)
	private long phone;
	@Column(name = "cust_email", unique = true, nullable = true)
	private String email;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "order_id")
	private Order order;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	
	private Address address;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
	


