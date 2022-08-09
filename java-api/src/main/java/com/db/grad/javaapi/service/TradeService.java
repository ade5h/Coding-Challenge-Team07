package com.db.grad.javaapi.service;

import java.util.List;

import com.db.grad.javaapi.dto.TradeDto;
import com.db.grad.javaapi.model.Trade;

public interface TradeService {
	List<Trade> getTradesForSecurity(Long securityId);

	List<Trade> getAllTrades(); 
	
	Trade getTradeById(Long id);
	
	Trade createTrade(TradeDto tradeDto);
	
	Trade updateTrade(TradeDto tradeDto, Long id);
	
	boolean deleteTrade(Long id);

}
