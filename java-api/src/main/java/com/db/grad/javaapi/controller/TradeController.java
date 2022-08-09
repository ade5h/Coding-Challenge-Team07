package com.db.grad.javaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.dto.TradeDto;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.service.SecurityService;
import com.db.grad.javaapi.service.TradeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("trade") 
@CrossOrigin
public class TradeController {
	
	@Autowired
	SecurityService securityService;
	@Autowired
	TradeService tradeService;
	
	@GetMapping("/all")
	public List<Trade> getAllTrades(){
		return tradeService.getAllTrades();
	}
	
	@GetMapping("/{id}")
	public Trade getTradeById(@PathVariable Long id) {
		return tradeService.getTradeById(id);
	}
	
	@PostMapping("/create")
	public Trade createTrade(@RequestBody TradeDto tradeDto){
		return tradeService.createTrade(tradeDto);
	}
	
	@PutMapping("/update/{id}")
	public Trade updateTrade(@RequestBody TradeDto tradeDto, @PathVariable Long id){
		return tradeService.updateTrade(tradeDto, id);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteSecurtiy(@PathVariable Long id){
		if(tradeService.deleteTrade(id)) {
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}		
	}
}
