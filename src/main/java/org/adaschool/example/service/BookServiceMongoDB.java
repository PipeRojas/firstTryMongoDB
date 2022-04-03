package org.adaschool.example.service;

import org.adaschool.example.model.Book;
import org.adaschool.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceMongoDB implements BookService{
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return (Book) bookRepository.save(book);
    }
}
