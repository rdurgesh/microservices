package com.product.service.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.domain.Product;
import com.product.service.domain.Products;
import com.product.service.repository.ProductRepository;

@RestController
public class ProductResource {

	private final ProductRepository productRepository;

	@Autowired
	public ProductResource(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@PostMapping("/product")
	public ResponseEntity<Long> newproduct(@RequestBody Product product) {
		product = productRepository.save(product);
		return ResponseEntity.ok().body(product.getId());
	}

	@GetMapping(("/products"))
	public ResponseEntity<Products> products() {
		Products products = new Products(productRepository.findAll());
		return ResponseEntity.ok().body(products);
	}

}
