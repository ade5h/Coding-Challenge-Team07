package com.db.grad.javaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long> {
	List<Trade> findByIdIn(List<Long> trades);
}
