package com.db.grad.javaapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Security;

public interface SecurityRepository extends JpaRepository<Security, Long> {
	List<Security> findByMaturityDateBetween(Date startDate, Date endDate);
}
