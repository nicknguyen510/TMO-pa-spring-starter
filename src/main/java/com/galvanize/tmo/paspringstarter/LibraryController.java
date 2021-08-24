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
    public void newBook(@RequestBody Book book) {
    	book.setID(count++);
    	library.books.add(book);

    }
    
   
    
    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
    	
    	count = 0;
    	library.books.clear();
    	
    }
}
