package com.arthpr.coursejava.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1l, "Arthur", "arthur@gmail.com", "11984272433", "1234");
		return ResponseEntity.ok().body(u);
	}
}
