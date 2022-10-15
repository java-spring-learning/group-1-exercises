package com.example.examplessessiontwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.examplessessiontwo.exception.RecordNotFoundException;
import com.example.examplessessiontwo.model.Book;
import com.example.examplessessiontwo.service.BookService;

@Controller
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	BookService service;

	@GetMapping()
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> list = service.getAllBooks();
		return new ResponseEntity<List<Book>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) throws RecordNotFoundException {
		Book entity = service.getBookById(id);
		return new ResponseEntity<Book>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBookById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteByBookId(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public ResponseEntity<Book> createOrUpdateBook(@RequestBody Book user) throws RecordNotFoundException {
		Book updated = service.createOrUpdateBook(user);
		return new ResponseEntity<Book>(updated, new HttpHeaders(), HttpStatus.OK);
	}
}
