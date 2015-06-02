package com.softdive.madpiggy.app.client.model;

public class UserProfile {

	private long id;
	private long userId;
	private ProfileType profileType;
	private String profileId;

	// TODO add more fields as per the profile preference.

	public long getUserId() {
		return userId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public static enum ProfileType {
		EMAIL, FACEBOOK, GOOGLE, TWITTER, LINKEDIN, MOBILE
	}
}
