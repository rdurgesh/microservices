package com.oauth.service.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	@Override
	public AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("john").password("john").roles("USER", "ADMIN").and().withUser("admin")
				.password("admin").roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.csrf().disable();
		http.authorizeRequests().antMatchers("/**").permitAll().and()
		// default protection for all resources (including /oauth/authorize)
		 .authorizeRequests().anyRequest().hasRole("USER").and().csrf().disable();
		// ... more configuration, e.g. for form login
	}

	/*
	 * localhost:5050/oauth/token?grant_type=password&username=john&password=
	 * john
	 */

}
