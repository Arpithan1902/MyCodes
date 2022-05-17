package com.cg.eis.exception;

@SuppressWarnings("serial")
class AgeExceptionDemo extends Exception {
	public AgeExceptionDemo(String str) {
		super(str);
	}
}

public class AgeException {
	static void validate(int age) throws AgeExceptionDemo {
		if (age < 15) {
			throw new AgeExceptionDemo("\nAge Should be Greator than 15");
		} else {
			System.out.println("Valid age");
		}
	}

	public static void main(String args[]) {
			try
			{
				validate(9);
			}
			catch (AgeExceptionDemo ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	              
	            System.out.println("Exception occured: \n" + ex);  
	        }  
	  
	           
	    }

}
