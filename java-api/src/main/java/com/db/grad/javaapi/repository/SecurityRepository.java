package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Security;

public interface SecurityRepository extends JpaRepository<Security, Long> {
	
}
