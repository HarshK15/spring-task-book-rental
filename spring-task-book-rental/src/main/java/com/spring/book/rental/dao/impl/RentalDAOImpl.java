package com.spring.book.rental.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.book.rental.dao.RentalDAO;
import com.spring.book.rental.dao.model.Rental;
import com.spring.book.rental.dao.repository.RentalRepository;

@Repository
public class RentalDAOImpl implements RentalDAO {

	@Autowired
	RentalRepository rentalRepository;
	
	@Override
	public Rental addRental(Rental rental) {
		return rentalRepository.save(rental);
	}
}
