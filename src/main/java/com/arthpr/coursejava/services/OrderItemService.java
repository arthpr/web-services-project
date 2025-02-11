package com.arthpr.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthpr.coursejava.entities.OrderItem;
import com.arthpr.coursejava.repositories.OrderItemRepository;

@Service
public class OrderItemItemService {

	@Autowired
	private OrderItemRepository oirep;
	
	public List<OrderItem> findAll() {
		return oirep.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = oirep.findById(id);
		return obj.get();
	}
}
