package com.soa.training.soatraining.controller.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Value(value = "${com.soa.message}")
	private String message;

	@Bean
	public Message message() {
		Message msg = new Message();
		msg.setText(message + " Message from external bean");
		return msg;
	}

}
