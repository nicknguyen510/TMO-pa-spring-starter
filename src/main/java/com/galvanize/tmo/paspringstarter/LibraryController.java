package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
public class LibraryController {
	
	private Integer count = 0;
	private Books library;
	LibraryController() {
		library = new Books();
	}
	


    @GetMapping("/health")
    public void health() {

    }
    
    @GetMapping("/api/books")
    public Books all(){
    	return library;
    }
    
    @PostMapping("/api/books")
    ResponseEntity<Book> newBook(@RequestBody Book book) {
    	book.setID(count++);
    	library.books.add(book);
    	return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }
    
   
    
    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAll() {
    	
    	count = 0;
    	library.books.clear();
    	
    }
}
