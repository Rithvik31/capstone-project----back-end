package com.ani.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.project.domain.Finance;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
    
}