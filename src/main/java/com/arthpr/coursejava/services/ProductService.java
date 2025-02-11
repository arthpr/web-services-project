package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.Product;
import com.arthpr.coursejava.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodrep;
	
	public List<Product> findAll() {
		return prodrep.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = prodrep.findById(id);
		return obj.get();
	}
}
