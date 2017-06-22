package com.customer.service.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.domain.Customer;
import com.customer.service.domain.Customers;
import com.customer.service.repository.CustomerRepository;

@RestController
public class CustomerResources {
	
	private final CustomerRepository customerResources;
	
	@Autowired
	public CustomerResources(CustomerRepository customerResources) {
		this.customerResources = customerResources;
	}


	@PostMapping("/custumer")
	public ResponseEntity<Long> newCustomer(@RequestBody Customer customer){
		customer = customerResources.save(customer);
		return ResponseEntity.ok().body(customer.getId());
	}
	
	
	@GetMapping(("/custumers"))
	public ResponseEntity<Customers> customers(){
		Customers customers = new Customers(customerResources.findAll());
		return ResponseEntity.ok().body(customers);
	}

}
