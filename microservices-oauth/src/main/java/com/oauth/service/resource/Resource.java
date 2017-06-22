package com.oauth.service.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

	@GetMapping("/resource/endpoint")
	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> endPoint() {
		return ResponseEntity.ok().body("This Message is protected by the resource server");
	}
}
