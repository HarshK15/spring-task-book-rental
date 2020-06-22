package com.spring.book.rental.dao;


import com.spring.book.rental.dao.model.CardHolder;

public interface CardHolderDAO {

	CardHolder findByCardHolderId(Integer id);

	CardHolder addCardHolder(CardHolder cardHolder);

}
