package com.soa.training.soatraining.vehicle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soa.training.soatraining.vehicle.Vehicle;
import com.soa.training.soatraining.vehicle.dao.VehicleJpaRepository;

@Transactional
@Service("vehicleService")
public class VehicleServiceImp implements VehicleService {

	private final VehicleJpaRepository vehicleJpaRepository;
	
	@Autowired
	public VehicleServiceImp(VehicleJpaRepository vehicleServiceJpa) {
		this.vehicleJpaRepository = vehicleServiceJpa;
	}

	@Override
	public void newVehicle(Vehicle management) {
		vehicleJpaRepository.saveAndFlush(management);
		//vehicleRepository.newVehicle(management);
	}

	@Override
	public Vehicle getVehicle(long id) {
		return vehicleJpaRepository.getOne(id);
	}

	@Override
	public long updateVehicle(long id) {
		Vehicle vehicle = vehicleJpaRepository.getOne(id);
		return vehicleJpaRepository.saveAndFlush(vehicle).getId();
	}

	@Override
	public List<Vehicle> getVehicles() {
		//List<Vehicle> vehicles = vehicleRepository.getVehicles();
		List<Vehicle> vehiclesJpa = vehicleJpaRepository.findAll();
		//vehicles.addAll(vehiclesJpa);
		return vehiclesJpa;
	}

}
