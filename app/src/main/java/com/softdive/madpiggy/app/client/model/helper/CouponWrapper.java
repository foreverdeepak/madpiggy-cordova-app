package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

import com.softdive.madpiggy.app.client.model.Coupon;
import com.softdive.madpiggy.app.client.model.Outlet;

public class CouponWrapper {

	private Coupon coupon;
	private Collection<Outlet> outlets;

	public Collection<Outlet> getOutlets() {
		return outlets;
	}

	public void setOutlets(Collection<Outlet> outlets) {
		this.outlets = outlets;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}
