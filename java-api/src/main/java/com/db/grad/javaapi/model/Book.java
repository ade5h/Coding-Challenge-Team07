package com.db.grad.javaapi.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	Long id;
	String name;

	@OneToMany(mappedBy = "book")
	List<Trade> trades;

	@ManyToMany
	@JoinTable(name = "book_user", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<User> users;

	public Book() {
	}

	public Book(Long id, String name, List<Trade> trades, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.trades = trades;
		this.users = users;
	}

	public List<User> getBooks() {
		return users;
	}

	public void setBooks(List<User> books) {
		this.users = books;
	}

	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", trades=" + trades + ", users=" + users + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, trades, users);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(trades, other.trades)
				&& Objects.equals(users, other.users);
	}

}
