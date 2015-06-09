package com.softdive.madpiggy.app.client.storage.user;

import com.softdive.madpiggy.app.client.model.Address;
import com.softdive.madpiggy.app.client.storage.HTMLStorage;

public class DefaultAddressStorage implements AddressStorage {

	@Override
	public void saveAddress(Address address) {
		setCity(address.getCity());
		setId(address.getId());
		setLatitude(address.getLatitude());
		setLine1(getLine1());
		setLine2(address.getLine2());
		setLongitude(address.getLongitude());
		setPhone1(address.getPhone1());
		setPhone2(address.getPhone2());
		setPhone3(address.getPhone3());
		setPin(address.getPin());
		setState(address.getState());
	}

	@Override
	public Address retrieveAddress() {
		Address address = new Address();
		address.setCity(getCity());
		address.setId(getId());
		address.setLatitude(getLatitude());
		address.setLine1(getLine1());
		address.setLine2(getLine2());
		address.setLongitude(getLongitude());
		address.setPhone1(getPhone1());
		address.setPhone2(getPhone2());
		address.setPhone3(getPhone3());
		address.setPin(getPin());
		address.setState(getState());
		return address;
	}
	
	public long getId() {
		return HTMLStorage.INSTANCE.getLong(USER_ADDRESS_ID, 0);
	}

	public void setId(long id) {
		HTMLStorage.INSTANCE.putLong(USER_ADDRESS_ID, id);
	}

	public String getLine1() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_LINE_1, "");
	}

	public void setLine1(String line1) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_LINE_1, line1);
	}

	public String getLine2() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_LINE_2, "");
	}

	public void setLine2(String line2) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_LINE_2, line2);
	}

	public String getCity() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_CITY, "");
	}

	public void setCity(String city) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_CITY, city);
	}

	public String getPin() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_PIN, "");
	}

	public void setPin(String pin) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_PIN, pin);
	}

	public String getState() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_STATE, "");
	}

	public void setState(String state) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_STATE, state);
	}

	public String getPhone1() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_PHONE_1, "");
	}

	public void setPhone1(String phone1) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_PHONE_1, phone1);
	}

	public String getPhone2() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_PHONE_2, "");
	}

	public void setPhone2(String phone2) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_PHONE_2, phone2);
	}

	public String getPhone3() {
		return HTMLStorage.INSTANCE.getString(USER_ADDRESS_PHONE_3, "");
	}

	public void setPhone3(String phone3) {
		HTMLStorage.INSTANCE.putString(USER_ADDRESS_PHONE_3, phone3);
	}

	public double getLatitude() {
		return HTMLStorage.INSTANCE.getDouble(USER_ADDRESS_LATITUDE, 0);
	}

	public void setLatitude(double latitude) {
		HTMLStorage.INSTANCE.putDouble(USER_ADDRESS_LATITUDE, latitude);
	}

	public double getLongitude() {
		return HTMLStorage.INSTANCE.getDouble(USER_ADDRESS_LONGITUDE, 0);
	}

	public void setLongitude(double longitude) {
		HTMLStorage.INSTANCE.putDouble(USER_ADDRESS_LONGITUDE, longitude);
	}

}
