package com.example.exercises1week4.Service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class ServiceLibrarian {
    private final   LibrarianRepository librarianRepository;


    public List<Librarian> getAllLibrarian() {
        return librarianRepository.findAll();
    }

    public void addLibrarian(Librarian librarian) {
        LibrarianRepository.save(librarian);
    }

    public Boolean uptadeLibrarian(Integer id, Librarian librarian) {
        Librarian oldLibrarian = LibrarianRepository.getById(id);
        if (oldLibrarian == null) {
            return false;

    }

    public Boolean deleteLibrarian(Integer id) {
            librarian oldLibrarian = LibrarianRepository.getById(id);
        if (oldLibrarian == null) {
            return false;
        }
        librarianRepository.delete(oldLibrarian);
        return true;
    }
