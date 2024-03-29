package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Preference;

import java.util.Collection;

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
