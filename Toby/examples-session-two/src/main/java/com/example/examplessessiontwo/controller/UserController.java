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
import com.example.examplessessiontwo.model.User;
import com.example.examplessessiontwo.service.UserService;

@Controller
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping()
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> list = service.getAllUsers();
		return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) throws RecordNotFoundException {
		User entity = service.getUserById(id);
		return new ResponseEntity<User>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUserById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteByUserId(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) throws RecordNotFoundException {
		User updated = service.createOrUpdateUser(user);
		return new ResponseEntity<User>(updated, new HttpHeaders(), HttpStatus.OK);
	}
}
