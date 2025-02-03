package com.arthpr.coursejava.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.Order;
import com.arthpr.coursejava.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResourse {

	@Autowired
	private OrderService usv;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = usv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = usv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
