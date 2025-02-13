package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.User;
import com.arthpr.coursejava.repositories.UserRepository;
import com.arthpr.coursejava.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository urep;
	
	public List<User> findAll() {
		return urep.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = urep.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return urep.save(obj);
	}
	
	public void delete(Long id) {
		urep.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = urep.getOne(id);
		updateData(entity, obj);
		return urep.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
