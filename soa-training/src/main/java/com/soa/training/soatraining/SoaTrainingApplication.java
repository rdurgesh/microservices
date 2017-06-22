package com.soa.training.soatraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.soa.training.soatraining.vehicle.Vehicle;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses=Vehicle.class)
public class SoaTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaTrainingApplication.class, args);
	}
}
