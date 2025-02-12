package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItemPK, Long> {

}
