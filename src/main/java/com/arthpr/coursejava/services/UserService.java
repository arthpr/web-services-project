package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.User;
import com.arthpr.coursejava.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository urep;
	
	public List<User> findAll() {
		return urep.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = urep.findById(id);
		return obj.get();
	}
}
