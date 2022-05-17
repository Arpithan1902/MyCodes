package com.cg.thread;

class BankCustomer {

	double amnt=10000;

	synchronized void withdraw(double amount) {
		if (this.amnt < amount) {
			System.out.println("less balance,kindly deposit");
			try {
				wait();
			} catch (Exception e) {

			}
		}
		this.amnt = this.amnt - amount;
		System.out.println(this.amnt + " 	remining");
	}

	synchronized void deposit(double amount) {
		System.out.println("deposit");
		this.amnt = this.amnt + amount;
		System.out.println("deposited");
		notify();

	}
	}
	
	class AccountHolder1 extends Thread{
		BankCustomer customer;
		public AccountHolder1(BankCustomer customer) {
			this.customer=customer;
		}
		public void run() {
			customer.withdraw(15000);
		}
	}

	public class Bank {
	public void main(String[] args) {
		BankCustomer cust=new BankCustomer();
		//BankCustomer customer;
		AccountHolder1 ac1=new AccountHolder1(cust);
		ac1.start();
		
		
		new Thread() {
			public void run() {
				cust.deposit(1000);
			}
		}.start();
	}
	}

	
	
		
