package com.oauth.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MicroservicesOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesOauthApplication.class, args);
	}
}
