package com.spring.book.rental.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.book.rental.dao.model.Rental;

public interface RentalRepository extends CrudRepository<Rental, Integer>{

}
