package com.softdive.madpiggy.app.client.model;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class Outlet extends Imageable {

	private long id;
	private Company company;
	@Valid
	private Address address;
	@Size(min = 1, max = 255)
	private String name;
	private String description;
	private Double distance;
	private long mallId; //if mallId == 0 ? then this outlet is not present in a mall
	private Collection<String> beaconId;
	private boolean isPremium;

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

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
	
	public void setMallId(long mallId) {
		this.mallId = mallId;
	}
	
	public long getMallId() {
		return mallId;
	}

}
