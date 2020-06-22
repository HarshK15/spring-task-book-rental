package com.spring.book.rental.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.book.rental.dao.model.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

	@Query("select * from Book where IS_BOOK_AVAILABLE = 'true' ")
	public List<Book> findAllByIsBookAvailableTrue();
	
	public List<Book> findAll();
	
	public Optional<Book> findById(Integer id);
}
