package com.arthpr.coursejava.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthpr.coursejava.entities.OrderItem;
import com.arthpr.coursejava.services.OrderItemService;

@RestController
@RequestMapping(value = "/OrderItems")
public class OrderItemItemResourse {

	@Autowired
	private OrderItemService oisv;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		List<OrderItem> list = oisv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
		OrderItem obj = oisv.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
