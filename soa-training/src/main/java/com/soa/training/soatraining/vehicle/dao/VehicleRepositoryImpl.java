package com.soa.training.soatraining.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.soa.training.soatraining.vehicle.Vehicle;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public VehicleRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void newVehicle(Vehicle management) {
		Object[] params = new Object[] { management.getId(), management.getName(), management.getStatus(),
				management.getCurrentDriver() };
		String query = "insert into VEHICLE (id, name, status, currentDriver) values (?,?,?,?)";
		jdbcTemplate.update(query, params);
	}

	@Override
	public Vehicle getVehicle(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateVehicle(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Vehicle> getVehicles() {
		return jdbcTemplate.query("SELECT * FROM VEHICLE", new BeanPropertyRowMapper(Vehicle.class));
	}

}
