package com.galvanize.tmo.paspringstarter;


import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	private static AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String author;
	private String title;
	private Long yearPublished;
	
	Book(){
		
	}
	
	Book(String author, String title, Long yearPublished){
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.id = count.incrementAndGet();
	}
	
	public int getID() {
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
