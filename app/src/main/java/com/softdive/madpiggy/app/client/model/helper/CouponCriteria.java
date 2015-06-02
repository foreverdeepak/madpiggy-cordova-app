package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

public class CouponCriteria {

	private Collection<Long> couponIds;
	private Collection<Long> outletIds;
	private GeoCriteria geoCriteria;

	public Collection<Long> getCouponIds() {
		return couponIds;
	}

	public void setCouponIds(Collection<Long> couponIds) {
		this.couponIds = couponIds;
	}

	public Collection<Long> getOutletIds() {
		return outletIds;
	}

	public void setOutletIds(Collection<Long> outletIds) {
		this.outletIds = outletIds;
	}

	public GeoCriteria getGeoCriteria() {
		if(geoCriteria == null) {
			geoCriteria = new GeoCriteria();
		}
		return geoCriteria;
	}

	public void setGeoCriteria(GeoCriteria geoCriteria) {
		this.geoCriteria = geoCriteria;
	}

}
