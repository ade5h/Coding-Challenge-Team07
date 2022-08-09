package com.db.grad.javaapi.dto;

import java.util.List;
import java.util.Objects;

public class WatchlistUpdateDto {
	Long userId;
	List<Long> securities;
	public WatchlistUpdateDto(Long userId, List<Long> securities) {
		super();
		this.userId = userId;
		this.securities = securities;
	}
	public WatchlistUpdateDto() {
		super();
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Long> getSecurities() {
		return securities;
	}
	public void setSecurities(List<Long> securities) {
		this.securities = securities;
	}
	@Override
	public String toString() {
		return "WatchlistUpdateDto [userId=" + userId + ", securities=" + securities + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(securities, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WatchlistUpdateDto other = (WatchlistUpdateDto) obj;
		return Objects.equals(securities, other.securities) && Objects.equals(userId, other.userId);
	}
	
	
}
