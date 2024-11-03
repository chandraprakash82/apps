package com.test.docker.compose.dao;

import com.test.docker.compose.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
