package com.db.grad.javaapi.dto;

import java.util.Objects;

public class SignupDto {
	String email;
	String password;
	String name;
	public SignupDto(String email, String password, String name) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
	}
	public SignupDto() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignupDto other = (SignupDto) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "SignupDto [email=" + email + ", password=" + password + ", name=" + name + "]";
	}
	
	
	
}
