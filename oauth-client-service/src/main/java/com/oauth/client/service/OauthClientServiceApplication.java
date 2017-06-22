package com.oauth.client.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableOAuth2Client
public class OauthClientServiceApplication {

	@Bean
	public OAuth2RestTemplate restTemplate() {
		return new OAuth2RestTemplate(resource(), new DefaultOAuth2ClientContext());
	}

	@Bean
	protected OAuth2ProtectedResourceDetails resource() {
		ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();
		details.setAccessTokenUri("http://localhost:5050/oauth/token");
		details.setClientId("webApp");
		details.setClientSecret("secret");
		details.setGrantType("password");
		return details;
	}

	public static void main(String[] args) {
		SpringApplication.run(OauthClientServiceApplication.class, args);
	}
}
