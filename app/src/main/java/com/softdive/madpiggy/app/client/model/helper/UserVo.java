package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.UserProfile;

public class UserVo {

	private User user;
	private UserProfile userProfile;
	private String password;
	private String deviceId;

	public UserVo() {
	}

	public UserVo(User user, UserProfile userProfile, String password) {
		this.user = user;
		this.userProfile = userProfile;
		this.password = password;
	}

	public UserVo(User user, UserProfile userProfile) {
		this.user = user;
		this.userProfile = userProfile;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
