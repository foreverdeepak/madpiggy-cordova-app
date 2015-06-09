package com.softdive.madpiggy.app.client.storage.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.softdive.madpiggy.app.client.model.Preference;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.User.Gender;
import com.softdive.madpiggy.app.client.model.UserProfile;
import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;
import com.softdive.madpiggy.app.client.model.helper.Latlng;

public class MockUserStorage implements UserStorage {
	
	private User user;
	
	private Latlng latlng;
	
	private int radius;
	
	public MockUserStorage() {
		latlng = new Latlng(23, 43);
		user = new User();
		user.setId(1618);
		user.setFname("Mayank");
		user.setLname("Sood");
		UserProfile userProfile = new UserProfile();
		userProfile.setProfileType(ProfileType.MOBILE);
		user.setActiveProfile(userProfile);
		user.setAbout("O realy");
		user.setGender(Gender.COMPLICATED);
		user.setDob(new Date());
		user.setPrimaryEmail("abcd@xyz.com");
		user.setPrimaryMobileNumber("0000000000");
		Collection<Preference> preferences = new ArrayList<Preference>();
		Preference fm1 = new Preference();
		fm1.setName(UserConstants.FAV_MALLS);
		fm1.setValue(String.valueOf(6));
		Preference fm2 = new Preference();
		fm2.setName(UserConstants.FAV_MALLS);
		fm2.setValue(String.valueOf(4));
		Preference fm3 = new Preference();
		fm3.setName(UserConstants.FAV_OUTLETS);
		fm3.setValue(String.valueOf(754));
		preferences.add(fm1);
		preferences.add(fm3);
		preferences.add(fm2);
		user.setPreferences(preferences);
		user.setNetworkJoined(true);
	}

	@Override
	public void saveUser(User user, ProfileType profileType) {

	}

	@Override
	public User retrieveSavedUser() {
		return user;
	}

	@Override
	public void updateUser(User u) {
		user = u;
	}

	@Override
	public void updateUserLocation(Latlng latLng) {
		if (latlng != null) {
			this.latlng = latLng;
		}
	}

	@Override
	public Latlng getUserLocation() {
		return latlng;
	}

	@Override
	public int getUserRadius() {
		if (radius == 0) {
			radius = 10;
		}
		return radius;
	}

	@Override
	public void updateUserRadius(int userRadius) {
		radius = userRadius;
	}

}
