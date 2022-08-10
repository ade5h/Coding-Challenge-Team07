package com.db.grad.javaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.db.grad.javaapi.dto.LoginDto;
import com.db.grad.javaapi.dto.SignupDto;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User checkLogin(LoginDto loginDto) {
		User user = userRepo.findByEmail(loginDto.getEmail());
		if(user.getPassword().equals(loginDto.getPassword())) {
			return user;
		}else {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
	}

	@Override
	public User signupUser(SignupDto signupDto) {
		User user = new User();
		user.setName(signupDto.getName());
		user.setEmail(signupDto.getEmail());
		user.setPassword(signupDto.getPassword());
		
		user = userRepo.saveAndFlush(user);
		return user;
	}

}
