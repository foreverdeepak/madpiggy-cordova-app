package com.softdive.madpiggy.app.client.model;

public class UserBadgeInfo {

	private long userId;
	private String badgeName;
	private long pointsEarned;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getBadgeName() {
		return badgeName;
	}

	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}

	public long getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(long pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

}
