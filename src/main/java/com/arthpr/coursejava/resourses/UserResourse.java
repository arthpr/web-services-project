package com.arthpr.coursejava.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.User;
import com.arthpr.coursejava.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	@Autowired
	private UserService usv;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = usv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = usv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
