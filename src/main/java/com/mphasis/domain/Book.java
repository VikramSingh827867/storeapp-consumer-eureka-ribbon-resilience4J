package com.mphasis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	public Book() {
		super();
	}
	private Long id;
	private String title;
	private String author;
    private String isbn;
    private int pages;
    private int publicationYear;
    private String publisher;
	
	
	
    
public Book(Long id, String title, String author, String isbn, int pages, int publicationYear, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
		this.publicationYear = publicationYear;
		this.publisher = publisher;
	}
public Book(long id, String string, String string2, String string3, int i, int j, String string4) {
		// TODO Auto-generated constructor stub
	}
	//	public Book(long id2, String string, String string2, String string3, int i, int j, String string4) {
//		// TODO Auto-generated constructor stub
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	

}
