package com.mphasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mphasis.domain.Book;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class BookService {
	
	@Autowired
	private RestTemplate resttemplate;
	
	@Retry(name="book-service")
	@CircuitBreaker(name="book-service#getBookById",fallbackMethod = "fallbackGetBookById")
   public Book getBookById(long id) {
		try {
		Book book = resttemplate.getForObject("http://book-service/books/" + id, Book.class);
		
		return book;
   }catch (Exception e) {
       System.out.println("Error fetching book: " + e.getMessage());
       throw e;  // Rethrow to let Hystrix handle it
   }
}
	
	public Book fallbackGetBookById( long id, Throwable cause) {
		
		System.out.println("Exception caught :" +cause.getMessage());
		
		return new Book(id, "title", "author", "isbn", 100, 2100, "publisher");
	}
	}
	

