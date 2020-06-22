package com.spring.book.rental.service;

import java.util.List;

import com.spring.book.rental.DTO.BookDTO;
import com.spring.book.rental.DTO.RentBookRequest;

public interface BookService {

	public List<BookDTO> getAllAvailableBook();
	
	public void addBook(BookDTO bookDTO);

	void rentBook(RentBookRequest bookRequest) throws Exception;
}
