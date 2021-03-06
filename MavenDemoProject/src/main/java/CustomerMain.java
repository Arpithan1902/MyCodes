import java.util.Scanner;

import javax.persistence.*;
public class CustomerMain {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		
		EntityManager em=factory.createEntityManager();
		CustomerMaven cust=new CustomerMaven();
		
		cust.setCustId(8); //primary key have to change before Execution
		cust.setCustName("bsbb");
		cust.setCustPhn(88286885);
		cust.setCustEmail("bsdgga8@gmail.com");
		
		
		em.getTransaction().begin(); //to begin transaction
		
		em.persist(cust); //save cust object into DB-->persist(Object); 
		
		em.getTransaction().commit(); //commit into DB
		
		
		System.out.println("Data inserted Successfully");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of customer");
		int id=Integer.parseInt(sc.nextLine());
		
		
		CustomerMaven cust1=em.find(CustomerMaven.class, id);//fetch data using particular id
		
		
		System.out.println(cust1.getCustId()+" "+cust1.getCustName()+" "+cust1.getCustPhn()+" "+cust1.getCustEmail());
		

	}

}
