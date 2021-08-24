package com.galvanize.tmo.paspringstarter;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	private @Id Integer id;
	private static Integer count = 0;
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
	
	public Integer getID() {
		return id;
	}
	
	public void setId(Integer id) {
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
