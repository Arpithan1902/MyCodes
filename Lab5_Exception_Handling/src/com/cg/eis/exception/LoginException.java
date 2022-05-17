package com.cg.eis.exception;

public class LoginException {
	public static int getDiv(int b) {
		int a = 200;
		return a / b;

	}

	public static void main(String args[]) {
		System.out.println(getDiv(0));
	}
}
