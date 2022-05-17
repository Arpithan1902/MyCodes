package com.assignments;

import java.util.HashMap;
import java.util.Set;

class Person {
	private int id;
	private String name;
	private int age;
	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

public class Citizenship {
	public HashMap<String, String> addPerson(HashMap<String, Integer> person) {
		HashMap<String, String> citizenship = new HashMap<>();
		Set<String> set = person.keySet();

		for (String s : set) {
			Integer age = person.get(s);

			if (age <= 10) {
				citizenship.put(s, "Child");
			} else if (age >= 11 && age <= 18) {
				citizenship.put(s, "Adolescent");
			} else if (age >= 18 && age <= 25) {
				citizenship.put(s, "young");
			} else if (age >= 25 && age <= 45) {
				citizenship.put(s, "Adult");
			} else if (age >= 45 && age <= 60) {
				citizenship.put(s, "MidAge");
			} else if (age >= 60) {
				citizenship.put(s, "Senior");
			}
		}
		return citizenship;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> person = new HashMap<>();
		Citizenship ex = new Citizenship();

		person.put("A", 70);
		person.put("B", 50);
		person.put("C", 45);
		person.put("D", 18);
		person.put("E", 67);

		System.out.println(ex.addPerson(person));
	}

}
