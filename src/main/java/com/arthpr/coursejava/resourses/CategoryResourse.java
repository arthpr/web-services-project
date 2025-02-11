package com.arthpr.coursejava.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.Category;
import com.arthpr.coursejava.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResourse {

	@Autowired
	private CategoryService catsv;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = catsv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = catsv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
