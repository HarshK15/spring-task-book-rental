package com.spring.book.rental.dao.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.spring.book.rental.dao.model.CardHolder;

public interface CardHolderRepository extends CrudRepository<CardHolder, Integer> {

	public Optional<CardHolder> findById(Integer id);
}
