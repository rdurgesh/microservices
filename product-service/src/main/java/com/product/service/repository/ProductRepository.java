package com.product.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.product.service.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String lastName);
}
