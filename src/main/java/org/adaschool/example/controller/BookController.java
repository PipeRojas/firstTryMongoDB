package org.adaschool.example.controller;

import org.adaschool.example.model.Book;
import org.adaschool.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(@Autowired BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.getAll());
    }

    @PostMapping("/books")
    public ResponseEntity<Book> saveBook(Book book){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookService.saveBook(book));
    }
}
