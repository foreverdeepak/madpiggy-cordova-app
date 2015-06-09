package com.softdive.madpiggy.app.client.model;

public class Mall extends Imageable {
	private long id;
	private String mallName;
	private String description;
	private double latitude;
	private double longitude;
	private int totalOutlets;
	private Address address;
	private Double distance;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getTotalOutlets() {
		return totalOutlets;
	}

	public void setTotalOutlets(int totalOutlets) {
		this.totalOutlets = totalOutlets;
	}
}
