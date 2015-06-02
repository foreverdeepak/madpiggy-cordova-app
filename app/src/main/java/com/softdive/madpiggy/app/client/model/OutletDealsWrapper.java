package com.softdive.madpiggy.app.client.model;

import java.util.Collection;

public class OutletDealsWrapper {

	private Outlet outlet;
	private Collection<Advertisement> advertisements;

	public Outlet getOutlet() {
		return outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

	public Collection<Advertisement> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(Collection<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

}
