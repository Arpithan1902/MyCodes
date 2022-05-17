package com.book.entity;
import javax.persistence.*;

@Entity
@Table(name="author_tbl")
public class Author {
	
	@Id
	private int authorId;
	@Column
	private String firstName;
	@Column
	private String middleName;
	@Column
	private String lastName;
	@Column
	private long phoneNo;
	
	@ManyToOne
	private Book book;
	
	public Author(int authorId, String firstName, String middleName, String lastName, long phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	public Author() {
		
	}

	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void addbook(Book book1) {
		
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}
