package com.db.grad.javaapi.service;

import java.util.Date;
import java.util.List;

import com.db.grad.javaapi.model.Security;

public interface SecurityService {
	
	List<Security> getAllSecurities();
	
	Security getSecurityById(Long id);
	
	List<Security> getSecuritiesByDateRange(Date initDate, Date lastDate);
	
	List<Security> getSecuritiesByUserId(Long userId);
}
