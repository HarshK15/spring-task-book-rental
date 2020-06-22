package com.spring.book.rental.dao;

import java.util.List;

import com.spring.book.rental.dao.model.Book;

public interface BookDAO {

	public List<Book> findAllAvailableBook();

	void addBook(Book book);

	Book findByBookId(Integer id) throws Exception;
}
