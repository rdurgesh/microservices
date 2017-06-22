package com.product.service.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;

	private Date mfDate;

	private Date expDate;

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

	public Date getMfDate() {
		return mfDate;
	}

	public void setMfDate(Date mfDate) {
		this.mfDate = mfDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
}
