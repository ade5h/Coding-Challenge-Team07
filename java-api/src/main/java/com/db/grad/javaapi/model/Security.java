package com.db.grad.javaapi.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="securities")
public class Security {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String ISIN;
	String CUSIP;
	String issuer;
	@Temporal(TemporalType.DATE)
	@Column(name="MATURITYDATE")
	Date maturityDate;
	String coupon;
	String type;
	@Column(name="FACEVALUE")
	Double faceValue;
	String status;
	
	@OneToMany(mappedBy="security")
	List<Trade> trades;
	
	public Security(Long id, String iSIN, String cUSIP, String issuer, Date maturityDate, String coupon, String type,
			Double faceValue, String status, List<Trade> trades) {
		super();
		this.id = id;
		ISIN = iSIN;
		CUSIP = cUSIP;
		this.issuer = issuer;
		this.maturityDate = maturityDate;
		this.coupon = coupon;
		this.type = type;
		this.faceValue = faceValue;
		this.status = status;
		this.trades = trades;
	}

	public Security() {}
	
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

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getCUSIP() {
		return CUSIP;
	}

	public void setCUSIP(String cUSIP) {
		CUSIP = cUSIP;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(Double faceValue) {
		this.faceValue = faceValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CUSIP, ISIN, coupon, faceValue, id, issuer, maturityDate, status, trades, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Security other = (Security) obj;
		return Objects.equals(CUSIP, other.CUSIP) && Objects.equals(ISIN, other.ISIN)
				&& Objects.equals(coupon, other.coupon) && Objects.equals(faceValue, other.faceValue)
				&& Objects.equals(id, other.id) && Objects.equals(issuer, other.issuer)
				&& Objects.equals(maturityDate, other.maturityDate) && Objects.equals(status, other.status)
				&& Objects.equals(trades, other.trades) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Security [id=" + id + ", ISIN=" + ISIN + ", CUSIP=" + CUSIP + ", issuer=" + issuer + ", maturityDate="
				+ maturityDate + ", coupon=" + coupon + ", type=" + type + ", faceValue=" + faceValue + ", status="
				+ status + ", trades=" + trades + "]";
	}
	
	
}
