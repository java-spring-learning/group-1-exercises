package com.example.examplessessiontwo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examplessessiontwo.exception.RecordNotFoundException;
import com.example.examplessessiontwo.model.User;
import com.example.examplessessiontwo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> getAllUsers() {
		List<User> userList = repository.findAll();
		if (userList.size() > 0) {
			return userList;
		} else {
			return new ArrayList<User>();
		}
	}

	public User getUserById(Long id) throws RecordNotFoundException {
		Optional<User> user = repository.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new RecordNotFoundException("No user record exist for given id");
		}
	}
	
	public User createOrUpdateUser(User entity) throws RecordNotFoundException{
		Optional<User> user = repository.findById(entity.getId());
		if(user.isPresent()) {
			User newEntity = user.get();
			newEntity.setEmail(entity.getEmail());
			newEntity.setName(entity.getName());
			newEntity = repository.save(newEntity);
			return newEntity;
		}else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	public User deleteByUserId(Long id) throws RecordNotFoundException{
		Optional<User> user = repository.findById(id);
		if (user.isPresent()) {
			repository.deleteById(id);
			return user.get();
		}else {
			throw new RecordNotFoundException("No user record exist for given id");
		}
	}
}
