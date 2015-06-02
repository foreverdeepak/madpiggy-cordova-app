package com.softdive.madpiggy.app.client.model;

public enum PreferenceType {

	TAG(true), SEX(true), EDUCATION(true), INTEREST(true), MIN_AGE(false), MAX_AGE(false), GEO_RADIUS(false), CAP_LIMIT(false);

	private boolean multiValued;

	PreferenceType(boolean multiValued) {
		this.multiValued = multiValued;
	}

	public boolean isMultiValued() {
		return multiValued;
	}
}
