package com.order.service.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.domain.Order;
import com.order.service.domain.Orders;
import com.order.service.repository.OrderRepository;

@RestController
public class OrderResource {
	
	private final OrderRepository orderRepository;
	
	@Autowired
	public OrderResource(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@PostMapping("/order")
	public ResponseEntity<Long> plcaeOrder(@RequestBody Order order){
		order = orderRepository.save(order);
		return ResponseEntity.ok().body(order.getId());
	}
	
	public ResponseEntity<Orders> orders(){
		Orders orders = new Orders(orderRepository.findAll());
		return ResponseEntity.ok().body(orders);
	}
}
