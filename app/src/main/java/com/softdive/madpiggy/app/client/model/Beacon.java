package com.softdive.madpiggy.app.client.model;

/**
 * @author Gaurav
 * 
 */
public class Beacon extends Persistable {

	private long id;
	private String beaconId;
	private Outlet outlet;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
	}

	public Outlet getOutlet() {
		return outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

}
