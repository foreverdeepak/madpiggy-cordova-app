package com.softdive.madpiggy.app.client.storage.user;

import com.softdive.madpiggy.app.client.model.UserProfile;
import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;
import com.softdive.madpiggy.app.client.storage.HTMLStorage;

public class DefaultUserProfileStorage implements UserProfileStorage {

	@Override
	public void saveUserProfile(UserProfile profile) {
		setId(profile.getId());
		setProfileId(profile.getProfileId());
		setProfileType(profile.getProfileType());
		setUserId(profile.getUserId());
	}

	@Override
	public UserProfile retrieveUserProfile() {
		UserProfile profile = new UserProfile();
		profile.setId(getId());
		profile.setProfileId(getProfileId());
		profile.setProfileType(getProfileType());
		profile.setUserId(getUserId());
		return profile;
	}
	
	public long getUserId() {
		return HTMLStorage.INSTANCE.getLong(USER_PROFILE_USER_ID, 0);
	}

	public long getId() {
		return HTMLStorage.INSTANCE.getLong(USER_PROFILE_ID, 0);
	}

	public void setId(long id) {
		HTMLStorage.INSTANCE.putLong(USER_PROFILE_ID, id);
	}

	public void setUserId(long userId) {
		HTMLStorage.INSTANCE.putLong(USER_PROFILE_USER_ID, userId);
	}

	public ProfileType getProfileType() {
		String type = HTMLStorage.INSTANCE.getString(USER_PROFILE_PROFILE_TYPE, "");
		if (type.trim().isEmpty()) {
			return null;
		}
		return ProfileType.valueOf(type); 
	}

	public void setProfileType(ProfileType profileType) {
		HTMLStorage.INSTANCE.putString(USER_PROFILE_PROFILE_TYPE, profileType.name());
	}

	public String getProfileId() {
		return HTMLStorage.INSTANCE.getString(USER_PROFILE_PROFILE_ID, "");
	}

	public void setProfileId(String profileId) {
		HTMLStorage.INSTANCE.putString(USER_PROFILE_PROFILE_ID, profileId);
	}

}
