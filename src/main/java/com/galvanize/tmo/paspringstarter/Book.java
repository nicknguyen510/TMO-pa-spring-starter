package com.galvanize.tmo.paspringstarter;


import javax.persistence.Entity;

@Entity
public class Book {
	
	private Long id;
	private String author;
	private String title;
	private Long yearPublished;
	
	Book(){
		
	}
	
	Book(String author, String title, Long yearPublished){
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.id++;
	}
	
	public Long getID() {
		return id;
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
