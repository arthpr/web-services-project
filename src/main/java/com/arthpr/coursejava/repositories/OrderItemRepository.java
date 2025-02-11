package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
