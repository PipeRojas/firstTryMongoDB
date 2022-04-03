package org.adaschool.example.service;

import org.adaschool.example.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book saveBook(Book book);
}
