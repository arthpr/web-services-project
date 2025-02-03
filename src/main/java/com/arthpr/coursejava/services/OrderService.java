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
	private OrderRepository urep;
	
	public List<Order> findAll() {
		return urep.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = urep.findById(id);
		return obj.get();
	}
}
