package com.bean;

public class Account implements Comparable<Account>  {
	private int id;
	private String name;
	private double balance;
	
	public Account() {
	
	}
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public int compareTo(Account o) {
		int result = this.id-o.getId();
		return result;
	}
}
