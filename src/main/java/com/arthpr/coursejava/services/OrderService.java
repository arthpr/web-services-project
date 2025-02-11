package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.Order;
import com.arthpr.coursejava.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orep;
	
	public List<Order> findAll() {
		return orep.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = orep.findById(id);
		return obj.get();
	}
}
