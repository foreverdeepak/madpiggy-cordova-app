package com.softdive.madpiggy.app.client.model;

import java.util.Collection;
import java.util.Map;

public class Retailer extends User {

	private Collection<Company> companies;
	private Map<Long, Outlet> outlets;

	public Collection<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(Collection<Company> companies) {
		this.companies = companies;
	}

	public Map<Long, Outlet> getOutlets() {
		return outlets;
	}

	public void setOutlets(Map<Long, Outlet> outlets) {
		this.outlets = outlets;
	}
}
