package com.greatlearning.LibraryManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.LibraryManagement.Model.Book;
import com.greatlearning.LibraryManagement.service.BookService;

@RestController
@RequestMapping("/books/v1")
public class BookController {

	@Autowired
	private BookService bookservice;

	@PostMapping
	public void addbook(@RequestBody Book book) {
		bookservice.save(book);
	}

	@GetMapping
	public List<Book> GetAllBooks() {
		return bookservice.findAll();

	}
}
