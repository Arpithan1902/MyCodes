package com.book.main;
import java.util.Scanner;

import javax.persistence.*;

import com.book.entity.Author;
import com.book.entity.Book;


public class AuthorMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();
		
		// Insert into author table
		Author author = new Author();
		author.setAuthorId(111);
		author.setFirstName("V");
		author.setMiddleName("A");
		author.setLastName("K");
		author.setPhoneNo(1223);
		
		
//		Book book1 = new Book();
//		book1.setBookPrice(400);
//		book1.setISBN(119);
//		book1.setBookTitle("Cricket");
//		book1.addauthor(author);
//		author.addbook(book1);

		Book book2 = new Book();
		book2.setBookPrice(400);
		book2.setISBN(110);
		book2.setBookTitle("RCB");
		book2.addauthor(author);
		author.addbook(book2);
		
		
		em.getTransaction().begin();
		em.persist(author);
		//em.persist(book1);
		em.persist(book2);
		em.getTransaction().commit();
		
		System.out.println("Data inserted Successfully");
		
		
		// getAuthorByID
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Author:");
		int id = Integer.parseInt(sc.nextLine());

		Author author1 = em.find(Author.class, id);

		System.out.println(author1.getAuthorId() + " " + author1.getFirstName() + " " + author1.getMiddleName() + " "
				+ author1.getLastName() + " " + author1.getPhoneNo()+" "+author1.getBook());
		
		
		
		// Update the price of books for which author name is entered by user
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter name of author to update price:");
		String name = sc2.nextLine();
		Author author4 = em.find(Author.class, name);
		em.getTransaction().begin();

		book2.setBookPrice(1000);
		author4.setBook(book2);
		
		em.getTransaction().commit();
		System.out.println("Updated ");
		
		
		

		// deleteAuthorById
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Enter id of author to delete:");
//		int id2 = Integer.parseInt(sc1.nextLine());
//
//		Author author2 = em.find(Author.class, id2);
//		em.getTransaction().begin();
//		em.remove(author2);
//		em.getTransaction().commit();
//
//		System.out.println("Deleted");

		
		
		// updateAuthorById
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("Enter id of author to update:");
//		int id3 = Integer.parseInt(sc1.nextLine());
//
//		Author author3 = em.find(Author.class, id3);
//		em.getTransaction().begin();
//		author3.setFirstName("a");
//		author3.setMiddleName("b");
//		author3.setLastName("c");
//		author3.setPhoneNo(789);
//		em.getTransaction().commit();
//		System.out.println("Updated ");

	}
}
