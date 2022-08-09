package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.Counterparty;

public interface CounterpartyRepository extends JpaRepository<Counterparty, Long> {

}
