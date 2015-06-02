package com.softdive.madpiggy.app.client.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Collection;

public class Outlet extends Imageable {

	private long id;
	private Company company;
	@Valid
	private Address address;
	@Size(min = 1, max = 255)
	private String name;
	private String description;
	private Double distance;
	//private long beaconId;
	private Collection<String> beaconId;
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Collection<String> getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(Collection<String> beaconId) {
		this.beaconId = beaconId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

}
