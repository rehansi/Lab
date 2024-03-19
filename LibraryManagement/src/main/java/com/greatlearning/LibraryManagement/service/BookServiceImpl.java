package com.greatlearning.LibraryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.LibraryManagement.Model.Book;
import com.greatlearning.LibraryManagement.dao.BookjpaRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	public BookjpaRepository bookjpa;
	
	@Override
	public void save(Book book) {
		bookjpa.save(book);
		
	}

	@Override
	public List<Book> findAll() {
		
		return bookjpa.findAll();
	}

	@Override
	public Book findById(int id) {
		Optional<Book> bookdetails = bookjpa.findById(id);
		if (bookdetails.isPresent()) {
			return bookdetails.get();
		} else {
			throw new RuntimeException("No detail of the book with this id is found " + id);
		}

		// return this.bookrepo.findById(id).orElseThrow(() -> new
		// IllegalArgumentException("Invalid order id ")) ;
	}
	

	@Override
	public void deleteById(int id) {
		bookjpa.deleteById(id);
		
	}

}
