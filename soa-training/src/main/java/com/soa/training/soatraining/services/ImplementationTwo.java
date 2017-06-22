package com.soa.training.soatraining.services;

import org.springframework.stereotype.Service;

@Service("implementationTwo")
public class ImplementationTwo implements Implementation{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "ImplementationTwo";
	}

}
