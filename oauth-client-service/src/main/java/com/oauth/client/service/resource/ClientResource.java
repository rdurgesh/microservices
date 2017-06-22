package com.oauth.client.service.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientResource {

	@Autowired
	private OAuth2RestTemplate auth2RestTemplate;

	@GetMapping("/exchange")
	public ResponseEntity<String> execute(Principal principal) throws URISyntaxException {
		// User user = (User) ((Authentication) principal).getPrincipal();
		URI uri = new URI("http://localhost:5050/resource/endpoint");
		RequestEntity<String> request = new RequestEntity<String>(HttpMethod.GET, uri);
		AccessTokenRequest accessTokenRequest = this.auth2RestTemplate.getOAuth2ClientContext().getAccessTokenRequest();
		accessTokenRequest.set("username", "john");
		accessTokenRequest.set("password", "john");
		ResponseEntity<String> data = auth2RestTemplate.exchange(request, String.class);
		return data;
	}

}
