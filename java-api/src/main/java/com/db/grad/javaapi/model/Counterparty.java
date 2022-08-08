package com.db.grad.javaapi.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "counter_party")
public class Counterparty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "counter_party_id")
	Long id;
	String name;

	@OneToMany(mappedBy = "counterParty")
	List<Trade> trades;

	public Counterparty(Long id, String name, List<Trade> trades) {
		super();
		this.id = id;
		this.name = name;
		this.trades = trades;
	}

	public Counterparty() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}

	@Override
	public String toString() {
		return "Counterparty [id=" + id + ", name=" + name + ", trades=" + trades + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, trades);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counterparty other = (Counterparty) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(trades, other.trades);
	}
}
