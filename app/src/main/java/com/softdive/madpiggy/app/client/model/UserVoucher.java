package com.softdive.madpiggy.app.client.model;

import java.util.Date;

public class UserVoucher {

	private long id;
	private long userId;
	private VoucherUnit voucherUnit;
	private long points;
	private Date purchaseDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public VoucherUnit getVoucherUnit() {
		return voucherUnit;
	}

	public void setVoucherUnit(VoucherUnit voucherUnit) {
		this.voucherUnit = voucherUnit;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
