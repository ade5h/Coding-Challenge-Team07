package com.db.grad.javaapi.dto;

import java.util.Date;
import java.util.Objects;

public class TradeDto {
	Integer quantity;
	String status;
	Double price;
	String buySell;
	Date tradeDate;
	Date settlementDate;
	Long book;
	Long counterParty;
	Long security;
	public TradeDto() {
		super();
	}
	public TradeDto(Integer quantity, String status, Double price, String buySell, Date tradeDate, Date settlementDate,
			Long book, Long counterParty, Long security) {
		super();
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.buySell = buySell;
		this.tradeDate = tradeDate;
		this.settlementDate = settlementDate;
		this.book = book;
		this.counterParty = counterParty;
		this.security = security;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBuySell() {
		return buySell;
	}
	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public Date getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}
	public Long getBook() {
		return book;
	}
	public void setBook(Long book) {
		this.book = book;
	}
	public Long getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(Long counterParty) {
		this.counterParty = counterParty;
	}
	public Long getSecurity() {
		return security;
	}
	public void setSecurity(Long security) {
		this.security = security;
	}
	@Override
	public int hashCode() {
		return Objects.hash(book, buySell, counterParty, price, quantity, security, settlementDate, status, tradeDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeDto other = (TradeDto) obj;
		return Objects.equals(book, other.book) && Objects.equals(buySell, other.buySell)
				&& Objects.equals(counterParty, other.counterParty) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(security, other.security)
				&& Objects.equals(settlementDate, other.settlementDate) && Objects.equals(status, other.status)
				&& Objects.equals(tradeDate, other.tradeDate);
	}
	@Override
	public String toString() {
		return "TradeDto [quantity=" + quantity + ", status=" + status + ", price=" + price + ", buySell=" + buySell
				+ ", tradeDate=" + tradeDate + ", settlementDate=" + settlementDate + ", book=" + book
				+ ", counterParty=" + counterParty + ", security=" + security + "]";
	}
	
}
