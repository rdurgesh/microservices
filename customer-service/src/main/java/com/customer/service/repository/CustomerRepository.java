package com.customer.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.customer.service.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByName(String lastName);
}
