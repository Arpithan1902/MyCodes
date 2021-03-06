package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookLibMain {
	  public static void main(String[] args){
	         Scanner scanner=new Scanner(System.in);
	         Library library=new Library();
	         int i,choice;
	         
	         for(i=0;i<50;i++){
	        	 System.out.println("\nEnter your choice:");
	             System.out.println("1.Add Book");
	             System.out.println("2.Display all book details");
	             System.out.println("3.Search Book by author");
	             System.out.println("4.Count number of books - by book name");
	             System.out.println("5.Exit");
	             choice=scanner.nextInt();scanner.nextLine();
	            
	             if(choice==1){
	                 Book book=new Book();
	                 System.out.println("Enter the isbn no:");
	                 book.setIsbnno(scanner.nextInt());scanner.nextLine();
	                 System.out.println("Enter the book name:");
	                 book.setBookName(scanner.nextLine());
	                 System.out.println("Enter the author name:");
	                 book.setAuthor(scanner.nextLine());
	                 library.addBook(book);
	             }
	             
	             if(choice==2){
	                 ArrayList<Book> result=library.viewAllBooks();
	                 if(result.isEmpty())
	                 {
	                     System.out.println("The list is empty");
	                     continue;
	                 }
	                 Iterator iterator=result.iterator();
	                 while(iterator.hasNext())
	                 {
	                     Book book=(Book)iterator.next();
	                     System.out.println("Isbn No: "+book.getIsbnno());
	                     System.out.println("Book name:"+book.getBookName());
	                     System.out.println("Author name: "+book.getAuthor());
	                 }
	             }
	             
	             if(choice==3){
	                 System.out.println("Enter author name:");
	                 
	                 String authorname=scanner.nextLine();
	                 ArrayList<Book> result=library.viewBooksByAuthor(authorname);
	                 if(result.isEmpty()){
	                     System.out.println(authorname+ "Not there in list");
	                     continue;
	                 }
	                 Iterator iterator1=result.iterator();
	                 while(iterator1.hasNext()){
	                     
	                     Book book1=(Book)iterator1.next();
	                     System.out.println(book1.getIsbnno());
	                     System.out.println(book1.getBookName());
	                     System.out.println(book1.getAuthor());
	                 }
	             }
	             
	             if(choice==4){
	                 System.out.println("Enter book name");
	                 String name=scanner.nextLine();
	                 System.out.println(" "+library.countnoofbook(name));
	             }
	             
	             if(choice==5)
	             System.exit(0);
	         }
	         
	     }
	 }

