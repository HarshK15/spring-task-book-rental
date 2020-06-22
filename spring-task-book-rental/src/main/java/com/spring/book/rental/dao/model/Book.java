package com.spring.book.rental.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column
	public int id;

	@Column
	public String title;

	@Column(value = "IS_BOOK_AVAILABLE")
	public boolean isBookAvailable;

	@Column
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
