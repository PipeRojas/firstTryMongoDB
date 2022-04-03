package org.adaschool.example.repository;

import org.adaschool.example.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends MongoRepository<Book, String> {

}