package gproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

class Employee {
	public void display() {
		System.out.println("welcome");
	}
}

public class TestJdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		try {

			Class.forName("org.postgresql.Driver");
			// Class.forName("gproject.Employee");//add package name

			System.out.println("Ok");
			// adtress
			// username
			// password
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arpitha",
					"batch11", "batch11");
			System.out.println(connection);
//			Scanner sc=new Scanner(System.in);
//			String sql1="create table"+
			
			
		} catch (Exception e) {
			System.out.println("Linking problem ="+e);
		}

	}
}
