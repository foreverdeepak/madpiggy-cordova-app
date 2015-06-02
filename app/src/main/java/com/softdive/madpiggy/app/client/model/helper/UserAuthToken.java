package com.softdive.madpiggy.app.client.model.helper;

public class UserAuthToken {

	private int id;
	private long userId;
	private String authToken;
	private String deviceId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getToken() {
		return authToken;
	}

	public void setToken(String authToken) {
		this.authToken = authToken;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
