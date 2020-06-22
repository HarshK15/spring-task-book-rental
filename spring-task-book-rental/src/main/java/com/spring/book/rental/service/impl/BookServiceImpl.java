package com.spring.book.rental.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.book.rental.DTO.BookDTO;
import com.spring.book.rental.DTO.RentBookRequest;
import com.spring.book.rental.dao.BookDAO;
import com.spring.book.rental.dao.CardHolderDAO;
import com.spring.book.rental.dao.RentalDAO;
import com.spring.book.rental.dao.model.Book;
import com.spring.book.rental.dao.model.CardHolder;
import com.spring.book.rental.dao.model.Rental;
import com.spring.book.rental.service.BookService;

@Service("bookService")
@Component
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDao;
	
	@Autowired
	CardHolderDAO cardHolderDAO;
	
	@Autowired
	RentalDAO rentalDAO;

	@Override
	public List<BookDTO> getAllAvailableBook() {
		List<BookDTO> bookDTOList = new ArrayList<>();
		List<Book> bookList = bookDao.findAllAvailableBook();
		bookList.forEach((book) -> {
			BookDTO bookdto = new BookDTO();
			BeanUtils.copyProperties(book, bookdto);
			bookDTOList.add(bookdto);
		});
		return bookDTOList;
	}

	@Override
	public void addBook(BookDTO bookDTO) {
		Book book = new Book();
		try {
			BeanUtils.copyProperties(bookDTO, book);
			bookDao.addBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void rentBook(RentBookRequest bookRequest) throws Exception {
		Book book = bookDao.findByBookId(bookRequest.getBookId());
		if(book == null || !book.isBookAvailable()) {
			throw new Exception("Book not available");
		}
		
		CardHolder cardHolder = new CardHolder();
		cardHolder.setFirstName(bookRequest.getFirstName());
		cardHolder.setLastName(bookRequest.getLastName());
		cardHolder.setCardNumber(bookRequest.getCardNumber());
		CardHolder holder = cardHolderDAO.addCardHolder(cardHolder);
		
		Rental rental = new Rental();
		rental.setBook_id(bookRequest.getBookId());
		rental.setCardHolder_id(holder.getId());
		rentalDAO.addRental(rental);
		
		book.setBookAvailable(Boolean.FALSE);
		bookDao.addBook(book);
		
	}

}
