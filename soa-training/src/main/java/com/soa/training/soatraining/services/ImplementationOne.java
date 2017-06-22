package com.soa.training.soatraining.services;

import org.springframework.stereotype.Service;

@Service("implementationOne")
public class ImplementationOne implements Implementation{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "ImplementationOne";
	}

}
