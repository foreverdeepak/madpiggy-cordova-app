package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.PreferenceType;

public class PreferenceCriteria {

	private PreferenceType type;
	private String value;

	public PreferenceType getType() {
		return type;
	}

	public void setType(PreferenceType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
