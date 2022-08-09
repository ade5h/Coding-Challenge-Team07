package com.db.grad.javaapi.service;

import java.util.Date;
import java.util.List;

import com.db.grad.javaapi.dto.SecurityDto;
import com.db.grad.javaapi.dto.WatchlistUpdateDto;
import com.db.grad.javaapi.model.Security;

public interface SecurityService {
	boolean updateWatchlist(WatchlistUpdateDto watchlistDto);
	
	List<Security> getUserWatchlist(Long userId);
	
	List<Security> getAllSecurities();
	
	Security getSecurityById(Long id);
	
	List<Security> getSecuritiesByDateRange(Date initDate, Date lastDate);
	
	List<Security> getSecuritiesByUserId(Long userId);
	
	Security createSecurity(SecurityDto securityDto);
	
	Security updateSecurity(SecurityDto securityDto, Long id);
	
	boolean deleteSecurity(Long id);
}
