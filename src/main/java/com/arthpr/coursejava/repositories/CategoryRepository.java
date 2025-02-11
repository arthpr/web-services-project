package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
