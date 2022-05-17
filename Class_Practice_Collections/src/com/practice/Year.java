package com.practice;

import java.util.ArrayList;

public class Year {
	public static int getYear(ArrayList<Integer> yr) {
		int year=0;
		int maxAdmission=0;
		
		for(int i=1;i<yr.size();i=i+2) {
			int j=yr.get(i);
			
			if(j>maxAdmission) {
				maxAdmission=j;
				year=yr.get(i-1);
			}
		}
		
		
		return year;
		
	}

}
