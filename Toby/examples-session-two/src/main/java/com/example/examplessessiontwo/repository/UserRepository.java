package com.example.examplessessiontwo.repository;

import org.springframework.stereotype.Repository;

import com.example.examplessessiontwo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
