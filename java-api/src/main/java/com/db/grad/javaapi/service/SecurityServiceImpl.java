package com.db.grad.javaapi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	SecurityRepository securityRepo;
	
	@Override
	public List<Security> getAllSecurities() {
		return securityRepo.findAll();
	}

	@Override
	public Security getSecurityById(Long id) {
		return securityRepo.findById(id).get();
	}

	@Override
	public List<Security> getSecuritiesByDateRange(Date initDate, Date lastDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Security> getSecuritiesByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
