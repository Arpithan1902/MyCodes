package com.stream.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.stream.bean.*;

import com.stream.bean.Employee;

public class MapOperationDemo {

	public static void main(String[] args) {
		
		//data Source
		List<String>list =new ArrayList<>();
		list.add("java");
		list.add("Sql");
		list.add("javaScript");
		
		list.stream().map(x->x.length()).forEach(x->System.out.println(x));
//		Function<String,Integer>fun1=x->x.length();
//		Consumer<Integer>con1=x->System.out.println(x);
//		list.stream().map(fun1).forEach(con1);
//	
		Employee emp1 = new Employee(101, "Arpitha", 50000, "developer", LocalDate.of(2010, 10, 20));
		Employee emp2 = new Employee(102, "Aaa", 5000, "Lead",LocalDate.of(2013, 10, 20));
		Employee emp3 = new Employee(103, "Appptha", 90000, "developr",LocalDate.of(2014, 10, 20));
		Employee emp4 = new Employee(104, "Aaatha", 59000, "develope", LocalDate.of(2015, 10, 20));
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp4);
		employees.add(emp3);
		employees.add(emp2);
		employees.add(emp1);
		
		//task : to store all developers in a separate list
		
		
	
	long count=employees.stream().filter(e->e.getRole().equals("developer")).count();
	System.out.println("No of developers: "+count);
	
	List<Integer> scores=new ArrayList<>();
	scores.add(50);
	scores.add(60);
	scores.add(70);
	scores.add(80);
	
	
	List<Integer> scores1=Arrays.asList(50,30,40,20);
	
	}
	

}
