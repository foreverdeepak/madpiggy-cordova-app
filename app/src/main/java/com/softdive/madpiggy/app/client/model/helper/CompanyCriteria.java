package com.softdive.madpiggy.app.client.model.helper;

public class CompanyCriteria {

	private GeoCriteria geoCriteria;
	private long retailerId;

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
