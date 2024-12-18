package com.arthpr.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthpr.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
