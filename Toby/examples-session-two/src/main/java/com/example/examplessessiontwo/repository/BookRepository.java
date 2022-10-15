package com.example.examplessessiontwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examplessessiontwo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
