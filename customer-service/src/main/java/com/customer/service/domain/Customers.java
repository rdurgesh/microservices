package com.customer.service.domain;

public class Customers {
	
	private Iterable<Customer> data;

	public Customers(Iterable<Customer> data) {
		this.data = data;
	}

	public Iterable<Customer> getData() {
		return data;
	}

	public void setData(Iterable<Customer> data) {
		this.data = data;
	}
}
