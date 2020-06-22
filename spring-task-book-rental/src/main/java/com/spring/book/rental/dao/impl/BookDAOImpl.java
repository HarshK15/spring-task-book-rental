package com.spring.book.rental.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.book.rental.DTO.BookDTO;
import com.spring.book.rental.dao.BookDAO;
import com.spring.book.rental.dao.model.Book;
import com.spring.book.rental.dao.repository.BookRepository;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	BookRepository bookRepository;
	

	@Override
	public List<Book> findAllAvailableBook() {
		return bookRepository.findAllByIsBookAvailableTrue();
	}
	
	@Override
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	public Book findByBookId(Integer id) throws Exception {
		Optional<Book> book = bookRepository.findById(id);
		Book  book2 =null;
		if (book.isPresent()) {
			book2 = book.get();
		}
		return book2;
	}

}
