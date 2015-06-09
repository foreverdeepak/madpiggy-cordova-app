package com.softdive.madpiggy.app.client.storage.user;

import com.google.gwt.core.client.GWT;
import com.softdive.madpiggy.app.client.model.Address;

public interface AddressStorage {
	
	public static final AddressStorage INSTANCE = GWT.create(AddressStorage.class);

	public void saveAddress(Address address);

	public Address retrieveAddress();
	
	public static final String USER_ADDRESS_ID = "USER_ADDRESS_ID";
	public static final String USER_ADDRESS_LINE_1 = "USER_ADDRESS_LINE_1";
	public static final String USER_ADDRESS_LINE_2 = "USER_ADDRESS_LINE_2";
	public static final String USER_ADDRESS_CITY = "USER_ADDRESS_CITY";
	public static final String USER_ADDRESS_PIN = "USER_ADDRESS_PIN";
	public static final String USER_ADDRESS_STATE = "USER_ADDRESS_STATE";
	public static final String USER_ADDRESS_PHONE_1 = "USER_ADDRESS_PHONE_1";
	public static final String USER_ADDRESS_PHONE_2 = "USER_ADDRESS_PHONE_2";
	public static final String USER_ADDRESS_PHONE_3 = "USER_ADDRESS_PHONE_3";
	public static final String USER_ADDRESS_LATITUDE = "USER_ADDRESS_LATITUDE";
	public static final String USER_ADDRESS_LONGITUDE = "USER_ADDRESS_LONGITUDE";
	
}
