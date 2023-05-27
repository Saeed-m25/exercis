package com.example.exercises1week4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface BookRepository extends JpaRepository<Book ,Integer>{
    Book findBookByAllBook(String AllBook);
    Book findBookBy

}
