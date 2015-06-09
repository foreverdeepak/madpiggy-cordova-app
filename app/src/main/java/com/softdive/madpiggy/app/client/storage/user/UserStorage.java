package com.softdive.madpiggy.app.client.storage.user;

import com.google.gwt.core.client.GWT;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;
import com.softdive.madpiggy.app.client.model.helper.Latlng;

public interface UserStorage {
	
	public UserStorage USER_STORAGE = GWT.create(UserStorage.class);
	
	public void saveUser(User user, ProfileType profileType);
	
	public User retrieveSavedUser();

	public void updateUser(User user);

	public void updateUserLocation(Latlng latLng);

	public Latlng getUserLocation();

	public int getUserRadius();

	public void updateUserRadius(int userRadius);
}
