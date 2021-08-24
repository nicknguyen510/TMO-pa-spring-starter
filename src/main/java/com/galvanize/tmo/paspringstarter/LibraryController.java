package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class LibraryController {
	
	private final LibraryRepository repo;
	
	private final Books bookList;
	
	LibraryController(LibraryRepository repo, Books bookList){
		this.repo = repo;
		this.bookList = bookList;
	}

    @GetMapping("/health")
    public void health() {

    }
    
    @GetMapping("/api/books")
    Books all(){
    	bookList.books = repo.findAll(Sort.by("title").ascending());
    	return bookList;
    }
    
    @PostMapping("/api/books")
    ResponseEntity<Book> newBook(@RequestBody Book book) {
    	repo.save(book);
    	return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }
    
    
    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAll() {
    	repo.deleteAll();
    }
}
