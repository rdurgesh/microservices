package com.soa.training.soatraining.vehicle.dao;


import java.util.List;

import com.soa.training.soatraining.vehicle.Vehicle;

public interface VehicleRepository {
	
	public void newVehicle(Vehicle management);
	
	public Vehicle getVehicle(long id);
	
	public int updateVehicle(long id);
	
	public List<Vehicle> getVehicles();

}
