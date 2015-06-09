package com.softdive.madpiggy.app.client.storage;

import com.google.gwt.core.client.GWT;

public interface HTMLStorage {
	
	public static HTMLStorage INSTANCE = GWT.create(HTMLStorage.class);
	
	public void putBoolean(String key, boolean value);
	
	public void putString(String key, String value);
	
	public void putLong(String key, long value);
	
	public void putInt(String key, int value);
	
	public boolean getBoolean(String key, boolean defaultValue);
	
	public String getString(String key, String defaultValue);
	
	public long getLong(String key, long defaultValue);
	
	public int getInt(String key, int defaultValue);
	
	public void putDouble(String key, double value);
	
	public double getDouble(String key, double defaultValue);
	
	public boolean clearAllStorage();

}
