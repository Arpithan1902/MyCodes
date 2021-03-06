import java.util.Scanner;

import javax.persistence.*;

public class AuthorMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = factory.createEntityManager();

		// Insert into author table
		Author author = new Author();
		author.setAuthorId(33);
		author.setFirstName("aaa");
		author.setMiddleName("aac");
		author.setLastName("daaa");
		author.setPhoneNo(12334);

		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();

		System.out.println("Data inserted Successfully");

		// getAuthorByID
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Author:");
		int id = Integer.parseInt(sc.nextLine());

		Author author1 = em.find(Author.class, id);

		System.out.println(author1.getAuthorId() + " " + author1.getFirstName() + " " + author1.getMiddleName() + " "
				+ author1.getLastName() + " " + author1.getPhoneNo());

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
