package com.ecom.main;

import java.util.Scanner;

import com.ecom.controller.OrderController;

public class OrderControllerMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Id: ");
		int pId=sc.nextInt();
		System.out.println("Enter product quantity: ");
		int qntty=sc.nextInt();
		sc.close();
		

		OrderController oC=new OrderController();
		oC.placeOrder(pId, qntty);
		

	}

}
