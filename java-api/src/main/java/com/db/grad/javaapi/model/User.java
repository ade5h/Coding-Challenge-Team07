package com.db.grad.javaapi.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	Long id;
	String name;
	String email;
	String role;

	@ManyToMany
	@JoinTable(name = "book_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "book_id"))
	List<Book> books;
	
	@OneToMany(mappedBy="user")
	@JsonBackReference
	List<Security> securityWatchList;
	
	public User(Long id, String name, String email, String role, List<Book> books, List<Security> securityWatchList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.books = books;
		this.securityWatchList = securityWatchList;
	}

	public User() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + ", books=" + books
				+ ", securityWatchList=" + securityWatchList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(books, email, id, name, role, securityWatchList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(books, other.books) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(role, other.role)
				&& Objects.equals(securityWatchList, other.securityWatchList);
	}

	public List<Security> getSecurityWatchList() {
		return securityWatchList;
	}

	public void setSecurityWatchList(List<Security> securityWatchList) {
		this.securityWatchList = securityWatchList;
	}
}
