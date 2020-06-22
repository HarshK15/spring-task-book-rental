package com.spring.book.rental.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.book.rental.dao.model.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

//	@Query("select b from Book b where b.IS_BOOK_AVAILABLE = 'true' ")
	public List<Book> findAllByIsBookAvailableTrue();
	
	public List<Book> findAll();
	
	public Optional<Book> findById(Integer id);
}
