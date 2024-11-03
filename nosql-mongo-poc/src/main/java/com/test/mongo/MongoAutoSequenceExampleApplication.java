package com.test.mongo;

import com.test.mongo.entity.Book;
import com.test.mongo.repository.BookRepository;
import com.test.mongo.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.test.mongo.entity.Book.*;

@SpringBootApplication
@RestController
public class MongoAutoSequenceExampleApplication {

	@Autowired
	private BookRepository repository;

	@Autowired
	private SequenceGeneratorService service;

	@PostMapping("/saveBook")
	public Book save(@RequestBody Book book){
		//generate sequence
		book.setId(service.getSequenceNumber(SEQUENCE_NAME));
		return repository.save(book);
	}

	@GetMapping("/books")
	public List<Book> getBooks(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(MongoAutoSequenceExampleApplication.class, args);
	}

}
