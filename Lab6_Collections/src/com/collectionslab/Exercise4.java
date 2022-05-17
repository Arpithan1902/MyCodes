package com.collectionslab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
	public HashMap<String, String> getStudent(HashMap<String, Integer> student) {
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = student.keySet();

		for (String s : set) {
			Integer marks = student.get(s);

			if (marks >= 90) {
				medal.put(s, "Gold");
			} else if (marks >= 80) {
				medal.put(s, "Silver");
			} else if (marks >= 70) {
				medal.put(s, "Bronze");
			}

		}
		return medal;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		Exercise4 ex = new Exercise4();

		// Scanner sc=new Scanner(System.in);

		student.put("R122", 76);
		student.put("R123", 89);
		student.put("R124", 90);
		student.put("R125", 93);
		System.out.println(ex.getStudent(student));
	}

}
