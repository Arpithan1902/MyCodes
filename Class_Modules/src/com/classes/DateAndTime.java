package com.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate today=LocalDate,now();
		System.out.println(today);
		
		LocalDateTime dTime=LocalDateTime.now();
		System.out.println(dTime);
		
		LocalDate dob=LocalDate.of(1998, 01, 19);
		System.out.println(dob);
		
		//LocalDate dob=LocalDate.of(1998, 02, 19);
		//System.out.println(dob)
		
		
		
	}

}
