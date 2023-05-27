package com.example.exercises1week4.Service;

import com.example.exercises1week4.ApiExeception.ApiExeseption;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class ServiceBook {
    private final BookRepository bookRepository;
    public void List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Boolean uptadeBook(Integer id, Book book) {
        Book oldBook = bookRepository.getById(id);
        if (oldBook == null) {
            return false;
        }
        bookRepository.save(oldBook);
        return true;


    }

    public Book findBookByAllBook(String AllBook) {
        Book book = bookRepository.findBookByAllBook(AllBook);
        if (book == null) {
            throw new ApiExeseption("not found");

        }

        return book;


    }
}
