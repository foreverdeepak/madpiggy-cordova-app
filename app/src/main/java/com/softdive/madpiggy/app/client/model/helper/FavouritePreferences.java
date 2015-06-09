package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

import com.softdive.madpiggy.app.client.model.Preference;

public class FavouritePreferences {

	private Collection<Preference> likedPreference;
	private Collection<Preference> disLikedPreference;

	public Collection<Preference> getLikedPreference() {
		return likedPreference;
	}

	public void setLikedPreference(Collection<Preference> likedPreference) {
		this.likedPreference = likedPreference;
	}

	public Collection<Preference> getDisLikedPreference() {
		return disLikedPreference;
	}

	public void setDisLikedPreference(Collection<Preference> disLikedPreference) {
		this.disLikedPreference = disLikedPreference;
	}

}
