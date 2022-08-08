package com.db.grad.javaapi.service;

import java.util.List;

import com.db.grad.javaapi.model.Trade;

public interface TradeService {
	List<Trade> getTradesForSecurity(Long securityId); 
}
