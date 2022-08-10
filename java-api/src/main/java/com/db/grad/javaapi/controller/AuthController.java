package com.db.grad.javaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.dto.LoginDto;
import com.db.grad.javaapi.dto.SignupDto;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.service.AuthService;


@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	AuthService authService;
	
	@PostMapping("/login")
	User checkLogin(@RequestBody LoginDto loginDto) {
		return authService.checkLogin(loginDto);
	}
	
	@PostMapping("/signup")
	User signupUser(SignupDto signupDto) {
		return authService.signupUser(signupDto);
	}
}
