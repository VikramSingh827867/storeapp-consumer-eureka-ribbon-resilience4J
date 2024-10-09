package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.mphasis.domain.Book;
import com.mphasis.service.BookService;

@RestController

public class ProductClientController {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	
	
	@GetMapping("/get-books/{id}")
	public Book getBookById(@PathVariable Long id) {
				
		return bookService.getBookById(id);
	}

}
