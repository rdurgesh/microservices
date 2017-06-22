package com.soa.training.soatraining.vehicle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soa.training.soatraining.vehicle.Vehicle;

@Repository
public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long>{

}
