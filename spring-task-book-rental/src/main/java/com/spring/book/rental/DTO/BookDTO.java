package com.spring.book.rental.DTO;

public class BookDTO {

	public int id;

	public String title;
	
	public boolean isBookAvailable;

	public String author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBookAvailable() {
		return isBookAvailable;
	}

	public void setBookAvailable(boolean isBookAvailable) {
		this.isBookAvailable = isBookAvailable;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
