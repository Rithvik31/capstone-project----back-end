package com.ani.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.User;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
}