package com.labexamples;

import java.util.Scanner;

                                         //Check INCREASING NUMBER or not
public class Exercise7 {
	
	public boolean checkNumber(int num)
    {
           boolean flag=false;
           String str = String.valueOf(num);
           int l = str.length();
           for(int i=0;i<l-1;i++)
           {
                  if(str.charAt(i)<=str.charAt(i+1) )
                        flag=true;
                  else
                        flag=false;
           }
           return flag;
    }
	public static void main(String args[]) {
		Exercise7 ex = new Exercise7();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int num= sc.nextInt();
		System.out.println(ex.checkNumber(num));
	}


}
