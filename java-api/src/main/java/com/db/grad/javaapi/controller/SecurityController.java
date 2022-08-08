package com.db.grad.javaapi.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.SecurityService;
import com.db.grad.javaapi.service.TradeService;

@RestController
@RequestMapping("security") 
@CrossOrigin
public class SecurityController {
	@Autowired
	SecurityService securityService;
	@Autowired
	TradeService tradeService;
	
	@GetMapping("/all")
	public List<Security> getAllSecurities(){
		return securityService.getAllSecurities();
	}
	
	@GetMapping("/{id}")
	public Security getSecurityById(@PathVariable Long id) {
		return securityService.getSecurityById(id);
	}
	
	@GetMapping("/date")
	public List<Security> getSecuritiesByDateRange(@RequestParam(name="initDate") String initDate, @RequestParam(name="lastDate") String lastDate) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		return securityService.getSecuritiesByDateRange(formatter.parse(initDate), formatter.parse(lastDate));
	}
	
	@GetMapping("/user/{userId}")
	public List<Security> getSecuritesByUserId(@PathVariable Long userId){
		return securityService.getSecuritiesByUserId(userId);
	}
	
	@GetMapping("/trades/{securityId}")
	public List<Trade> getTradesForSecurity(@PathVariable Long securityId){
		return tradeService.getTradesForSecurity(securityId);
	}
}
