package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.LoginDto;
import com.db.grad.javaapi.dto.SignupDto;
import com.db.grad.javaapi.model.User;

public interface AuthService {

	User checkLogin(LoginDto loginDto);
	
	User signupUser(SignupDto signupDto);
}
