package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

public class OutletCriteria {

	private Collection<Long> companyIds;
	private GeoCriteria geoCriteria;
	private long retailerId;

	// TODO add company preference query

	public Collection<Long> getCompanyIds() {
		return companyIds;
	}

	public void setCompanyIds(Collection<Long> companyIds) {
		this.companyIds = companyIds;
	}

	public GeoCriteria getGeoCriteria() {
		return geoCriteria;
	}

	public void setGeoCriteria(GeoCriteria geoCriteria) {
		this.geoCriteria = geoCriteria;
	}

	public long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(long retailerId) {
		this.retailerId = retailerId;
	}
}
