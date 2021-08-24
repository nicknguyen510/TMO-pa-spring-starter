package com.galvanize.tmo.paspringstarter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	private @Id Long id;
	private static Long count = 0;
	private String author;
	private String title;
	private Long yearPublished;
	
	Book(){
		
	}
	
	Book(String author, String title, Long yearPublished){
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		setId(count++);
	}
	
	public Long getID() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Long getYearPublished() {
		return yearPublished;
	}
	
	


}
