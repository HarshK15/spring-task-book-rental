package com.spring.book.rental.dao.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.book.rental.dao.CardHolderDAO;
import com.spring.book.rental.dao.model.CardHolder;
import com.spring.book.rental.dao.repository.CardHolderRepository;

@Repository
public class CardHolderDAOImpl implements CardHolderDAO {

	@Autowired
	CardHolderRepository cardHolderRepository;
	
	
	@Override
	public CardHolder findByCardHolderId(Integer id) {
		Optional<CardHolder> cardOptional = cardHolderRepository.findById(id);
		CardHolder cardHolder = null;
		if (cardOptional.isPresent()) {
			cardHolder = cardOptional.get();
		}
		return cardHolder;
	}
	
	@Override
	public CardHolder addCardHolder(CardHolder cardHolder) {
		return cardHolderRepository.save(cardHolder);
	}
	
}
