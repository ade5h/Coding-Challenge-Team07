package com.db.grad.javaapi.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.grad.javaapi.dto.SecurityDto;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.UserRepository;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	SecurityRepository securityRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	TradeRepository tradeRepo;

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
		return securityRepo.findByMaturityDateBetween(initDate, lastDate);
	}

	@Override
	public List<Security> getSecuritiesByUserId(Long userId) {

		System.out.println("before collection");
		Set<Security> result = Collections.emptySet();
		System.out.println("result ::" + userId);
		List<User> user = userRepo.findAll();
		System.out.println(user + "::: user");
		for (Book book : user.get(0).getBooks()) {
			for (Trade trade : book.getTrades()) {
				result.add(trade.getSecurity());
			}
		}
		System.out.println("###result :: " + result);
		return new ArrayList<Security>(result);

	}

	@Override
	public Security createSecurity(SecurityDto securityDto) {
		Security newSecurity = new Security();
		newSecurity.setCoupon(securityDto.getCoupon());
		newSecurity.setCUSIP(securityDto.getCUSIP());
		newSecurity.setFaceValue(securityDto.getFaceValue());
		newSecurity.setISIN(securityDto.getISIN());
		newSecurity.setIssuer(securityDto.getIssuer());
		newSecurity.setMaturityDate(securityDto.getMaturityDate());
		newSecurity.setStatus(securityDto.getStatus());
		newSecurity.setType(securityDto.getType());

		User user = userRepo.findById(securityDto.getUser()).get();
		newSecurity.setUser(user);
		
		List<Trade> trades = tradeRepo.findByIdIn(securityDto.getTrades());
		newSecurity.setTrades(trades);

		newSecurity = securityRepo.saveAndFlush(newSecurity);
		return newSecurity;
	}

	@Override
	public Security updateSecurity(SecurityDto securityDto, Long id) {
		Security newSecurity = securityRepo.findById(id).get();
		newSecurity.setCoupon(securityDto.getCoupon());
		newSecurity.setCUSIP(securityDto.getCUSIP());
		newSecurity.setFaceValue(securityDto.getFaceValue());
		newSecurity.setISIN(securityDto.getISIN());
		newSecurity.setIssuer(securityDto.getIssuer());
		newSecurity.setMaturityDate(securityDto.getMaturityDate());
		newSecurity.setStatus(securityDto.getStatus());
		newSecurity.setType(securityDto.getType());

		List<Trade> trades = tradeRepo.findByIdIn(securityDto.getTrades());
		newSecurity.setTrades(trades);

		newSecurity = securityRepo.saveAndFlush(newSecurity);
		return newSecurity;
	}

	@Override
	public boolean deleteSecurity(Long id) {
		try {
			securityRepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Security> getUserWatchlist(Long userId) {
		User user = userRepo.findById(userId).get();
		return user.getSecurityWatchList();
	}

}
