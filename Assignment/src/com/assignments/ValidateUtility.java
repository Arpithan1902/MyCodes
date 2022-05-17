package com.assignments;

import com.servicepack.Validate;

public class ValidateUtility {

    

    public static Validate validateEmployeeName() {
        return employeeName -> employeeName.matches("[a-zA-Z\\s]{5,20}");
    }

   
    public static Validate validateProductName() {
        return productName -> productName.matches("[a-zA-Z]{1}[\\d]{5}");
    }

    public static void main(String[] args) {
    	
        boolean isValidEmployeeName = ValidateUtility.validateEmployeeName().validateName("Pinky Rose");
        System.out.println(isValidEmployeeName);

        boolean isValidProductName = ValidateUtility.validateProductName().validateName("A8546");
        System.out.println(isValidProductName);
        
        boolean isValidEmployeeName1 = ValidateUtility.validateEmployeeName().validateName("Rahul@123");
        System.out.println(isValidEmployeeName1);

        boolean isValidProductName1 = ValidateUtility.validateProductName().validateName("X82456");
        System.out.println(isValidProductName1);
    } 
    }