package com.spring.book.rental.DTO;

public class RentBookRequest {

	private int bookId;
	
	private int cardHolderId;
	
	private String firstName;
	
	private String lastName;
	
	private String cardNumber;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCardHolderId() {
		return cardHolderId;
	}

	public void setCardHolderId(int cardHolderId) {
		this.cardHolderId = cardHolderId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
}
