package com.order.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.order.service.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
