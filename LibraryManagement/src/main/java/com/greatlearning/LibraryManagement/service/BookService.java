package com.greatlearning.LibraryManagement.service;

import java.util.List;

import com.greatlearning.LibraryManagement.Model.Book;

public interface BookService {

	public void save(Book book);

	public List<Book> findAll();

	public Book findById(int id);

	public void deleteById(int id);
}
