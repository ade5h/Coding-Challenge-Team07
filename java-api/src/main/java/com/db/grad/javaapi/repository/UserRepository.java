package com.db.grad.javaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.grad.javaapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
