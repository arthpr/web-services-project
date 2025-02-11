package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
