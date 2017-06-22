package com.soa.training.soatraining.vehicle;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String status;

	private String currentDriver;

	public Vehicle() {
	}

	public Vehicle(String name, String status, String currentDriver) {
		this.name = name;
		this.status = status;
		this.currentDriver = currentDriver;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrentDriver() {
		return currentDriver;
	}

	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", status=" + status + ", currentDriver=" + currentDriver + "]";
	}

}
