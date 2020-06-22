package com.spring.book.rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.rental.DTO.BookDTO;
import com.spring.book.rental.DTO.RentBookRequest;
import com.spring.book.rental.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("book-rental/getAllAvailableBooks")
	public List<BookDTO> getAllAvailableBooks(){
		return bookService.getAllAvailableBook();
	}
	
	@PostMapping(path="book-rental/rentABook", consumes = "application/json")
	public String rentABook(@RequestBody RentBookRequest bookRequest) {
		try {
			bookService.rentBook(bookRequest);
			return "You rented a Book Id : "+bookRequest.getBookId();
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
}
