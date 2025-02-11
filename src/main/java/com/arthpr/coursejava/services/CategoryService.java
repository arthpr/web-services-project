package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.Category;
import com.arthpr.coursejava.entities.Order;
import com.arthpr.coursejava.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catrep;
	
	public List<Category> findAll() {
		return catrep.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = catrep.findById(id);
		return obj.get();
	}
}
