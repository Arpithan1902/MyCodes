package com.utilility;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeUtility {
	
		
		
		public static Connection getConnect()
		{
			Connection connection=null;
		
			try
			{
				
				 Class.forName("org.postgresql.Driver");
				
				 connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arpitha",
							"batch11", "batch11");
				System.out.println(connection);
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return connection;
		}

	}