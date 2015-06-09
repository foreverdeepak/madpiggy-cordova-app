package com.softdive.madpiggy.app.client.storage;

import com.google.gwt.core.client.GWT;

public interface SessionStorage {
	
	public static SessionStorage INSTANCE = GWT.create(SessionStorage.class);
	
	public void putString(String key, String value);
	
	public String getItem(String key);
	
	public void clearStorage(String key);
	
}
