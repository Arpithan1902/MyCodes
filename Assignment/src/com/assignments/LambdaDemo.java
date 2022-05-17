package com.assignments;


import com.servicepack.CustomerService;

public class LambdaDemo {

	public static void main(String[] args) {
		CustomerService service=(name, pass)->{if(name.equalsIgnoreCase("admin") && pass.equals("123")) 
			{
				return true;
				
			}return false;
			
		};
		boolean b=service.login("admin","123");
			if(b) {
				System.out.println("You are valid admin");
			}else {
				System.out.println("You are not valid admin");
			}
		}
	}
		
	
		
		
	


