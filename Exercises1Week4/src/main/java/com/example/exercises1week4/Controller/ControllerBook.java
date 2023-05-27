package com.example.exercises1week4.Controller;

import com.example.exercises1week4.Service.ServiceBook;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/v1/Book")
@RequiredArgsConstructor
public class ControllerBook {
    private final ServiceBook serviceBook;
    @GetMapping("get/All")
    public ResponseEntity getAllBook(){
        List<Book> bookList =serviceBook.getAllBook();
        return ResponseEntity.status(200).body(bookList);

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAllBook() {
        List<Book> books = (List<Book>) ServiceBook.getAllBook();
    }
       return new ResponseEntity<>(Book, HttpStatus.OK);


    @PostMapping("/add/book")
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
        Book savedBook = ServiceBook.addBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @PutMapping("/update/book")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @Valid @RequestBody Book book) {
        Book.setId(id);
        Book updatedBook = ServiceBook.updateBook(book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @DeleteMapping("/delete/book")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        ServiceBook.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/email/{email}")
    public ResponseEntity<Book> getBookbyEmail(@PathVariable String email) {
        Book book = Servicebook.getBookbyEmail(email);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }



}
