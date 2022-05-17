package com.ecom.bean;

import java.time.LocalDate;

public class Order {
	private int orderId;
	private double orderAmount;
	private LocalDate dateOfOrder;
	private int pId;
	
	public Order(int orderId, double orderAmount,LocalDate dateOfOrder,int pId) {
		super();
		this.dateOfOrder=dateOfOrder;
		this.orderAmount=orderAmount;
		this.orderId=orderId;
		this.pId=pId;
		
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	

}
