package com.db.grad.javaapi.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "trades")
public class Trade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	Integer quantity;
	String status;
	Double price;
	@Column(name = "BUYSELL")
	String buySell;
	@Temporal(TemporalType.DATE)
	@Column(name = "TRADEDATE")
	Date tradeDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "SETTLEMENTDATE")
	Date settlementDate;

	@ManyToOne
	// @JoinColumn(name = "book_id")
	Book book;

	@ManyToOne
	// @JoinColumn(name = "security_id")
	Security security;

	@ManyToOne
	// @JoinColumn(name = "counterparty_id")
	Counterparty counterParty;

	public Trade(Long id, Integer quantity, String status, Double price, String buySell, Date tradeDate,
			Date settlementDate, Book book, Security security, Counterparty counterParty) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.buySell = buySell;
		this.tradeDate = tradeDate;
		this.settlementDate = settlementDate;
		this.book = book;
		this.security = security;
		this.counterParty = counterParty;
	}

	public Trade() {
		super();
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", quantity=" + quantity + ", status=" + status + ", price=" + price + ", buySell="
				+ buySell + ", tradeDate=" + tradeDate + ", settlementDate=" + settlementDate + ", book=" + book
				+ ", security=" + security + ", counterParty=" + counterParty + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, buySell, counterParty, id, price, quantity, security, settlementDate, status,
				tradeDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		return Objects.equals(book, other.book) && Objects.equals(buySell, other.buySell)
				&& Objects.equals(counterParty, other.counterParty) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(security, other.security) && Objects.equals(settlementDate, other.settlementDate)
				&& Objects.equals(status, other.status) && Objects.equals(tradeDate, other.tradeDate);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public Counterparty getCounterParty() {
		return counterParty;
	}

	public void setCounterParty(Counterparty counterParty) {
		this.counterParty = counterParty;
	}

}
