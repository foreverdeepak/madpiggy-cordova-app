package com.softdive.madpiggy.app.client.model;


public class AdDto {

	private Advertisement advertisement;
	private boolean userLiked;
	private boolean earnEnabled;

	public Advertisement getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(Advertisement advertisement) {
		this.advertisement = advertisement;
	}

	public boolean isUserLiked() {
		return userLiked;
	}

	public void setUserLiked(boolean userLiked) {
		this.userLiked = userLiked;
	}

	public boolean isEarnEnabled() {
		return earnEnabled;
	}

	public void setEarnEnabled(boolean earnEnabled) {
		this.earnEnabled = earnEnabled;
	}

}
