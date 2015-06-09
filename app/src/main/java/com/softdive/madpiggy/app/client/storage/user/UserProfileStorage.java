package com.softdive.madpiggy.app.client.storage.user;

import com.google.gwt.core.client.GWT;
import com.softdive.madpiggy.app.client.model.UserProfile;

public interface UserProfileStorage {
	
	public static final UserProfileStorage INSTANCE = GWT.create(UserProfileStorage.class);

	public void saveUserProfile(UserProfile profile);

	public UserProfile retrieveUserProfile();
	
	public static final String USER_PROFILE_USER_ID = "USER_PROFILE_USER_ID";
	public static final String USER_PROFILE_ID = "USER_PROFILE_ID";
	public static final String USER_PROFILE_PROFILE_TYPE = "USER_PROFILE_PROFILE_TYPE";
	public static final String USER_PROFILE_PROFILE_ID = "USER_PROFILE_PROFILE_ID";
}
