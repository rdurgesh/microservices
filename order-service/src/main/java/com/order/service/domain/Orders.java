package com.order.service.domain;

public class Orders {

	private Iterable<Order> data;

	public Orders(Iterable<Order> data) {
		super();
		this.data = data;
	}

	public Iterable<Order> getData() {
		return data;
	}
}
