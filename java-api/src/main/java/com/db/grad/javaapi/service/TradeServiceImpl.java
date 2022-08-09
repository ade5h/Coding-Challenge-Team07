package com.db.grad.javaapi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.grad.javaapi.dto.TradeDto;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Counterparty;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.CounterpartyRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.UserRepository;

@Service
public class TradeServiceImpl implements TradeService {
	@Autowired
	SecurityRepository securityRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	TradeRepository tradeRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	CounterpartyRepository counterpartyRepo;

	@Override
	public List<Trade> getTradesForSecurity(Long securityId) {
		return null;
	}

	@Override
	public List<Trade> getAllTrades() {
		return tradeRepo.findAll();
	}
	
	@Override
	public Trade getTradeById(Long id) {
		System.out.println("here id ====== "+ id);
		return tradeRepo.findById(id).get();
	}

	@Override
	public Trade createTrade(TradeDto tradeDto) {
		Trade newTrade = new Trade();
		newTrade.setQuantity(tradeDto.getQuantity());
		newTrade.setStatus(tradeDto.getStatus());
		newTrade.setPrice(tradeDto.getPrice());
		newTrade.setBuySell(tradeDto.getBuySell());
		newTrade.setTradeDate(tradeDto.getTradeDate());
		newTrade.setSettlementDate(tradeDto.getSettlementDate());
		
		Book book = bookRepo.findById(tradeDto.getBook()).get();
		newTrade.setBook(book);
		
		Counterparty counterParty = counterpartyRepo.findById(tradeDto.getCounterParty()).get();
		newTrade.setCounterParty(counterParty);
		
		Security security = securityRepo.findById(tradeDto.getSecurity()).get();
		newTrade.setSecurity(security);

		newTrade = tradeRepo.saveAndFlush(newTrade);
		return newTrade;
	}

	@Override
	public Trade updateTrade(TradeDto tradeDto, Long id) {
		Trade newTrade = tradeRepo.findById(id).get();
		newTrade.setQuantity(tradeDto.getQuantity());
		newTrade.setStatus(tradeDto.getStatus());
		newTrade.setPrice(tradeDto.getPrice());
		newTrade.setBuySell(tradeDto.getBuySell());
		newTrade.setTradeDate(tradeDto.getTradeDate());
		newTrade.setSettlementDate(tradeDto.getSettlementDate());
		
		Book book = bookRepo.findById(tradeDto.getBook()).get();
		newTrade.setBook(book);
		
		Counterparty counterParty = counterpartyRepo.findById(tradeDto.getCounterParty()).get();
		newTrade.setCounterParty(counterParty);
		
		Security security = securityRepo.findById(tradeDto.getSecurity()).get();
		newTrade.setSecurity(security);

		newTrade = tradeRepo.saveAndFlush(newTrade);
		return newTrade;
	}

	@Override
	public boolean deleteTrade(Long id) {
		try {
			tradeRepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
