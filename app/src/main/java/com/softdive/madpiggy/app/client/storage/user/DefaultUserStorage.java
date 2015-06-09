package com.softdive.madpiggy.app.client.storage.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;
import com.softdive.madpiggy.app.client.model.Address;
import com.softdive.madpiggy.app.client.model.Preference;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.User.Gender;
import com.softdive.madpiggy.app.client.model.UserProfile;
import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;
import com.softdive.madpiggy.app.client.model.helper.Latlng;
import com.softdive.madpiggy.app.client.model.helper.PreferenceWrapper;
import com.softdive.madpiggy.app.client.storage.HTMLStorage;
import com.softdive.madpiggy.app.client.util.JSONEncoderDecoder;

public class DefaultUserStorage implements UserStorage, UserStorageConstants {

	@Override
	public void saveUser(User user, ProfileType profileType) {
		saveAbout(user.getAbout());
		saveActiveProfile(user.getActiveProfile());
		saveDealNofitication(user.getDealNotification());
		saveAddress(user.getAddress());
		saveCampaignNotification(user.getCampaignNotification());
		saveDob(user.getDob());
		saveFName(user.getFname());
		saveGcmId(user.getGcmId());
		saveGender(user.getGender());
		saveId(user.getId());
		saveLName(user.getLname());
		saveNetworkJoined(user.isNetworkJoined());
		savePrimaryEmail(user.getPrimaryEmail());
		savePrimaryMobile(user.getPrimaryMobileNumber());
		saveProfileType(profileType);
		saveIosToken(user.getIosToken());
		savePreference(user.getPreferences());
	}

	private void saveProfileType(ProfileType profileType) {
		if (profileType != null) {
			HTMLStorage.INSTANCE.putString(PROFILE_TYPE, profileType.toString());
		}
	}

	@Override
	public User retrieveSavedUser() {
		if (getId() == 0) {
			return null;
		}
		User user = new User();
		user.setAbout(getAbout());
		user.setCampaignNotification(getCampaignNotification());
		user.setDealNotification(getDealNofitication());
		user.setFname(getFName());
		user.setGcmId(getGcmId());
		user.setGender(Gender.valueOf(getGender()));
		user.setId(getId());
		user.setLname(getLName());
		user.setNetworkJoined(getNetworkJoined());
		user.setPrimaryEmail(getPrimaryEmail());
		user.setPrimaryMobileNumber(getPrimaryMobile());
		user.setDob(getDob());
		user.setActiveProfile(getActiveProfile());
		user.setAddress(getAddress());
		user.setIosToken(getIosToken());
		user.setPreferences(getPreference());
		return user;
	}

	private void saveId(long id) {
		if (id != 0) {
			HTMLStorage.INSTANCE.putLong(USER_ID, id);
		}
	}

	private void saveFName(String fname) {
		if (fname != null && !fname.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_FNAME, fname);
		}
	}

	private void saveLName(String lname) {
		if (lname != null && !lname.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_LNAME, lname);
		}
	}

	private void savePrimaryEmail(String primaryEmail) {
		if (primaryEmail != null && !primaryEmail.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_PRIMARY_EMAIL, primaryEmail);
		}
	}

	private void savePrimaryMobile(String primaryMobile) {
		if (primaryMobile != null && !primaryMobile.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_PRIMARY_MOBILE, primaryMobile);
		}
	}

	private void saveDob(Date date) {
		if (date != null) {
			HTMLStorage.INSTANCE.putString(USER_DOB, DateTimeFormat.getFormat(PredefinedFormat.DATE_MEDIUM).format((date)));
		}
	}

	private void saveAbout(String about) {
		if (about != null && !about.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_ABOUT, about);
		}
	}

	private void saveGender(Gender gender) {
		if (gender != null) {
			HTMLStorage.INSTANCE.putString(USER_GENDER, gender.name());
		}
	}

	private void saveAddress(Address address) {
		if (address != null) {
			AddressStorage.INSTANCE.saveAddress(address);
		}
	}

	private void saveGcmId(String gcmId) {
		if (gcmId != null && !gcmId.isEmpty()) {
			HTMLStorage.INSTANCE.putString(USER_GCM, gcmId);
		}
	}

	private void saveActiveProfile(UserProfile activeProfile) {
		if (activeProfile != null) {
			UserProfileStorage.INSTANCE.saveUserProfile(activeProfile);
		}
	}

	private void saveDealNofitication(boolean value) {
		HTMLStorage.INSTANCE.putBoolean(USER_DEAL_NOTIFICATION, value);
	}

	private void saveCampaignNotification(boolean value) {
		HTMLStorage.INSTANCE.putBoolean(USER_CAMPAIGN_NOTIFICATION, value);
	}

	private void saveNetworkJoined(boolean value) {
		HTMLStorage.INSTANCE.putBoolean(USER_NTWRK_JOIN, value);
	}

	private void saveIosToken(String iosToken) {
		if (iosToken != null && !iosToken.trim().isEmpty()) {
			HTMLStorage.INSTANCE.putString(IOS_TOKEN, iosToken);
		}
	}

	// --------Getters--------//

	private long getId() {
		return HTMLStorage.INSTANCE.getLong(USER_ID, 0);
	}

	private String getFName() {
		return HTMLStorage.INSTANCE.getString(USER_FNAME, "");
	}

	private String getLName() {
		return HTMLStorage.INSTANCE.getString(USER_LNAME, "");
	}

	private String getPrimaryEmail() {
		return HTMLStorage.INSTANCE.getString(USER_PRIMARY_EMAIL, "");
	}

	private String getPrimaryMobile() {
		return HTMLStorage.INSTANCE.getString(USER_PRIMARY_MOBILE, "");
	}

	private String getAbout() {
		return HTMLStorage.INSTANCE.getString(USER_ABOUT, "");
	}

	private String getGender() {
		return HTMLStorage.INSTANCE.getString(USER_GENDER, "");
	}

	private String getGcmId() {
		return HTMLStorage.INSTANCE.getString(USER_GCM, "");
	}

	private boolean getDealNofitication() {
		return HTMLStorage.INSTANCE.getBoolean(USER_DEAL_NOTIFICATION, false);
	}

	private boolean getCampaignNotification() {
		return HTMLStorage.INSTANCE.getBoolean(USER_CAMPAIGN_NOTIFICATION, false);
	}

	private boolean getNetworkJoined() {
		return HTMLStorage.INSTANCE.getBoolean(USER_NTWRK_JOIN, false);
	}

	private Date getDob() {
		Date dob;
		String stringDate = HTMLStorage.INSTANCE.getString(USER_DOB, "");
		if (stringDate.trim().isEmpty()) {
			dob = new Date();
		} else {
			dob = DateTimeFormat.getFormat(PredefinedFormat.DATE_MEDIUM).parse(stringDate);
		}
		return dob;
	}

	private UserProfile getActiveProfile() {
		return UserProfileStorage.INSTANCE.retrieveUserProfile();
	}

	private Address getAddress() {
		return AddressStorage.INSTANCE.retrieveAddress();
	}

	private String getIosToken() {
		return HTMLStorage.INSTANCE.getString(IOS_TOKEN, null);
	}

	@Override
	public void updateUser(User user) {
		saveAbout(user.getAbout());
		saveActiveProfile(user.getActiveProfile());
		saveDealNofitication(user.getDealNotification());
		saveAddress(user.getAddress());
		saveCampaignNotification(user.getCampaignNotification());
		saveDob(user.getDob());
		saveFName(user.getFname());
		saveGcmId(user.getGcmId());
		saveGender(user.getGender());
		saveId(user.getId());
		saveLName(user.getLname());
		saveNetworkJoined(user.isNetworkJoined());
		savePrimaryEmail(user.getPrimaryEmail());
		savePrimaryMobile(user.getPrimaryMobileNumber());
		savePreference(user.getPreferences());
	}

	@Override
	public void updateUserLocation(Latlng latLng) {
		if (latLng != null) {
			HTMLStorage.INSTANCE.putDouble(LATITUDE, latLng.getLat());
			HTMLStorage.INSTANCE.putDouble(LONGITUDE, latLng.getLng());
		}

	}

	@Override
	public Latlng getUserLocation() {
		return new Latlng(HTMLStorage.INSTANCE.getDouble(LATITUDE, 0l), HTMLStorage.INSTANCE.getDouble(LONGITUDE, 0l));
	}

	@Override
	public int getUserRadius() {
		return HTMLStorage.INSTANCE.getInt(USER_RADIUS, 10);
	}

	@Override
	public void updateUserRadius(int userRadius) {
		HTMLStorage.INSTANCE.putInt(USER_RADIUS, userRadius);
	}

	public void savePreference(Collection<Preference> likedPreferences) {
		if (likedPreferences == null || likedPreferences.size() == 0) {
			return;
		}
		PreferenceWrapper wrapper = new PreferenceWrapper();
		wrapper.setPreferences(likedPreferences);
		HTMLStorage.INSTANCE.putString(USER_PREFERENCES, JSONEncoderDecoder.PREFERENCE_ENCODER_DECODER.encode(wrapper).toString());
	}

	public Collection<Preference> getPreference() {
		String value = HTMLStorage.INSTANCE.getString(USER_PREFERENCES, null);
		if (value == null || value.trim().isEmpty()) {
			return new ArrayList<Preference>();
		}
		PreferenceWrapper wrapper= JSONEncoderDecoder.PREFERENCE_ENCODER_DECODER.decode(value);
		return 	wrapper.getPreferences();
	}
}
