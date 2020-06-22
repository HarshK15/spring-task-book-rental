package com.spring.book.rental.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rental_id")
	public int rentalId;

	@Column(name = "cardHolder_id")
	public int cardHolder_id;

	@Column(name = "book_id")
	public int book_id;

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public int getCardHolder_id() {
		return cardHolder_id;
	}

	public void setCardHolder_id(int cardHolder_id) {
		this.cardHolder_id = cardHolder_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

}
