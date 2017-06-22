package com.soa.training.soatraining.vehicle.services;

import java.util.List;

import com.soa.training.soatraining.vehicle.Vehicle;

public interface VehicleService {

	public void newVehicle(Vehicle management);

	public Vehicle getVehicle(long id);

	public long updateVehicle(long id);

	public List<Vehicle> getVehicles();

}
