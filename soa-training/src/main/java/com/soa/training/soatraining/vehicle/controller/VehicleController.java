package com.soa.training.soatraining.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soa.training.soatraining.vehicle.Vehicle;
import com.soa.training.soatraining.vehicle.services.VehicleService;

@RestController
public class VehicleController {

	private final VehicleService vehicleService;

	@Autowired
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	@PostMapping("/vehicle")
	public void vehicle(@RequestBody Vehicle vehicle) {
		vehicleService.newVehicle(vehicle);
	}

	@GetMapping("/vehicle/{id}")
	public Vehicle vehicle(@PathVariable long id) {
		return new Vehicle();
	}

	@GetMapping("/vehicles")
	public List<Vehicle> vehicle() {
		List<Vehicle> vehicleManagement = vehicleService.getVehicles();
		return vehicleManagement;
	}

}
