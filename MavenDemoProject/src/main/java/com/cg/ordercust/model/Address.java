package com.cg.ordercust.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addreesId;
	private String city;
	private String pinCode;
	private String state;
	private String country;

//	public int getAddreesId() {
//		return addreesId;
//	}
//
//	public void setAddreesId(int addreesId) {
//		this.addreesId = addreesId;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getPinCode() {
//		return pinCode;
//	}
//
//	public void setPinCode(String pinCode) {
//		this.pinCode = pinCode;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}

}
