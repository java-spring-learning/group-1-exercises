package com.example.examplessessiontwo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examplessessiontwo.exception.RecordNotFoundException;
import com.example.examplessessiontwo.model.Book;
import com.example.examplessessiontwo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;

	public List<Book> getAllBooks() {
		List<Book> bookList = repository.findAll();
		if (bookList.size() > 0) {
			return bookList;
		} else {
			return new ArrayList<Book>();
		}
	}

	public Book getBookById(Long id) throws RecordNotFoundException {
		Optional<Book> book = repository.findById(id);
		if (book.isPresent()) {
			return book.get();
		} else {
			throw new RecordNotFoundException("No book record exist for given id");
		}
	}
	
	public Book createOrUpdateBook(Book entity) throws RecordNotFoundException{
		Optional<Book> book = repository.findById(entity.getId());
		if(book.isPresent()) {
			Book newEntity = book.get();
			newEntity.setTitle(entity.getTitle());
			newEntity.setAuthor(entity.getAuthor());
			newEntity = repository.save(newEntity);
			return newEntity;
		}else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	public Book deleteByBookId(Long id) throws RecordNotFoundException{
		Optional<Book> book = repository.findById(id);
		if (book.isPresent()) {
			repository.deleteById(id);
			return book.get();
		}else {
			throw new RecordNotFoundException("No book record exist for given id");
		}
	}
}
