package com.example.exercises1week4.Controller;

import com.example.exercises1week4.Service.ServiceBook;
import com.example.exercises1week4.Service.ServiceLibrarian;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/v1/librarian")
@RequiredArgsConstructor
public class ControllerLibrarian {
    private final ServiceLibrarian serviceLibrarian;
    @GetMapping("get/All")
    public ResponseEntity getAllLibrarian(){
        List<Librarian> LibrarianList =serviceLibrarian.getAllLibrarian();
        return ResponseEntity.status(200).body(librarianList);

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Librarian>> getAllLibrarian() {
        List<Librarian> Librarian = (List<Librarian>) ServiceLibrarian.getAllLibrarian();
    }
       return new ResponseEntity<>(Librarian, HttpStatus.OK);


    @PostMapping("/add/Librarian")
    public ResponseEntity<Librarian> addLibrarian(@Valid @RequestBody Librarian librarian) {
        Librarian savedLibrarian = ServiceLibrarian.addLibrarian(librarian);
        return new ResponseEntity<>(savedLibrarian, HttpStatus.CREATED);
    }

    @PutMapping("/update/Librarian")
    public ResponseEntity<Librarian> updateLibrarian(@PathVariable Long id, @Valid @RequestBody Librarian librarian) {
        Librarian.setId(id);
        Librarian updatedLibrarian = ServiceLibrarian.updateLibrarian(librarian);
        return new ResponseEntity<>(updatedLibrarian, HttpStatus.OK);
    }

    @DeleteMapping("/delete/Librarian")
    public ResponseEntity<Void> deleteLibrarian(@PathVariable Long id) {
        ServiceLibrarian.deleteLibrarian(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping("/email/{email}")
    public ResponseEntity<Librarian> getLibrarianbyEmail(@PathVariable String email) {
        Librarian librarian = ServiceLibrarian.getLibrarianbyEmail(email);
        return new ResponseEntity<>(Librarian, HttpStatus.OK);
    }



}
