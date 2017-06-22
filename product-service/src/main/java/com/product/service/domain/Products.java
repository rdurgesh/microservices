package com.product.service.domain;

public class Products {

	private Iterable<Product> data;

	public Products(Iterable<Product> data) {
		super();
		this.data = data;
	}

	public Iterable<Product> getData() {
		return data;
	}

	public void setData(Iterable<Product> data) {
		this.data = data;
	}
}
