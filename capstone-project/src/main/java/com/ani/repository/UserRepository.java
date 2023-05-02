package com.ani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.domain.User;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
}}