package com.arthpr.coursejava.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.Product;
import com.arthpr.coursejava.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResourse {

	@Autowired
	private ProductService prodsv;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = prodsv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = prodsv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
