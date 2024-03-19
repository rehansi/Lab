package com.greatlearning.LibraryManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.LibraryManagement.Model.Book;

@Repository
public interface BookjpaRepository extends JpaRepository <Book ,Integer> {

}
