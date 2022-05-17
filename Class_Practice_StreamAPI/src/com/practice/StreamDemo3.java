package com.practice;

import java.util.List;

public class StreamDemo3 {

public static void main(String[] args) {

HashMap<String, String> books = new HashMap<>(); 

books.put("001-095474383", "aaaa");

books.put("001-02547433", "Spider Man ");
books.put("001-0544383", "Bat Man ");
books.put("001-047438", "Shaktiman ");
books.put("001-04383", "HatIM ");

System.out.println(getBookBasedOnBookName (books));

}

public static List<String>getBookBasedOnBookName (HashMap<String, String> books)

{ 
	List<String> titles books. entrySet().stream().filter (e -> e.getKey().startsWith("001-0"))

.map (Map.Entry::getValue) .collect (Collectors.tolist());

return titles;

}

}