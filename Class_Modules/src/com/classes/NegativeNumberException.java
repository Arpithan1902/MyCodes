package com.classes;

public class NegativeNumberException extends Exception{

	//public static void main(String[] args) {
		public NegativeNumberException(String msg) {
			super(msg); 						// we r using super bcs we have to refer parent class i,e, checkedexception class
		}
	}

