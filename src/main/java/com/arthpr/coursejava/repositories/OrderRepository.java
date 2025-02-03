package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
