package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.AdDto;
import com.softdive.madpiggy.app.client.model.Outlet;

import java.util.ArrayList;
import java.util.Collection;

public class DealOutletWrapper {
	private AdDto advertisement;
	private Collection<Outlet> outlets = new ArrayList<Outlet>();

	public AdDto getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(AdDto advertisement) {
		this.advertisement = advertisement;
	}

	public Collection<Outlet> getOutlets() {
		return outlets;
	}

	public void setOutlets(Collection<Outlet> outlets) {
		this.outlets = outlets;
	}

}
