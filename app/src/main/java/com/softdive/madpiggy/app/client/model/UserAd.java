package com.softdive.madpiggy.app.client.model;

public class UserAd {

	private long userId;
	private long adId;
	private Status status;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getAdId() {
		return adId;
	}

	public void setAdId(long adId) {
		this.adId = adId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	private enum Status {
		SAVED, READ
	}
}
