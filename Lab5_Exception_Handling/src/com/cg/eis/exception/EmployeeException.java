package com.cg.eis.exception;

public class EmployeeException {

	

		@SuppressWarnings("serial")
		class EmployeeNameExceptionDemo extends Exception {
			public EmployeeNameExceptionDemo(String str) {
				super(str);
			}
		}
			public class EmployeeNameException{
		
			private String lastname;
			private String firstname;

			void validate(String name) throws EmployeeNameExceptionDemo {
				if (firstname=="" && lastname=="") {
					throw new EmployeeNameExceptionDemo("Age Should be Greator than 15");
				} else {
					System.out.println("Valid age");
				}
			}

			public void main(String[] args) {
					try
					{
						
					}
					catch (EmployeeNameExceptionDemo ex)  
			        {  
			            System.out.println("Caught the exception");  
			    
			              
			            System.out.println("Exception occured: \n" + ex);  
			        }  
			  
			           
			    }

		}

	}

}
