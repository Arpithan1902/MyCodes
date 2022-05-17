package com.labexamples;

import java.util.Scanner;

public class Exercise5 {
	 private int sum=0;
	 
     public int calculateSum(int n)
     {
            for(int i=0;i<=n;i++)
            {
                   if(i%3==0||i%5==0)
                   {
                         sum=sum+i;
                   }
            }
            return sum;
     }
     public static void main(String args[])
     {
            Exercise5 ex = new Exercise5();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number: ");
            int n=sc.nextInt();
            System.out.println(ex.calculateSum(n));
     }

}
