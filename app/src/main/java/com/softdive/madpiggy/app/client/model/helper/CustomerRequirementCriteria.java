package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Outlet;

public class CustomerRequirementCriteria {

	private Collection<String> tags;
	private Collection<Outlet> outlets;
	private Advertisement advertisement;

	public Advertisement getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(Advertisement advertisement) {
		this.advertisement = advertisement;
	}

	public Collection<String> getTags() {
		return tags;
	}

	public void setTags(Collection<String> tags) {
		this.tags = tags;
	}

	public Collection<Outlet> getOutlets() {
		return outlets;
	}

	public void setOutlets(Collection<Outlet> outlets) {
		this.outlets = outlets;
	}

}
