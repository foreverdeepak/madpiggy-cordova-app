package com.softdive.madpiggy.app.client.util;

import com.softdive.madpiggy.app.client.model.Address;

public class Util {
	
	public static boolean isValueNull(String value) {
		if (value == null || value.equalsIgnoreCase("undefined")) {
			return true;
		}
		return false;
	}

	public static String prepareAddress(Address address) {
		if(address == null){
			return "";
		}
		String addressString = "";

		addressString = addressString + address.getLine1();
		if (!isValueNull(address.getLine2()) && !address.getLine2().trim().isEmpty()) {
			addressString = addressString + ", " + address.getLine2();
		}
		if (!isValueNull(address.getCity()) && !address.getCity().trim().isEmpty()) {
			addressString = addressString + ", " + address.getCity();
		}
		return addressString;
	}
	
}
