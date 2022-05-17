package com.cg.cust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@Sequencegenerator(name)
	private int addressId;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	
	

}
