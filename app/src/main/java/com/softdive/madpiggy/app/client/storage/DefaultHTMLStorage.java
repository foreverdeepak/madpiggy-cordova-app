package com.softdive.madpiggy.app.client.storage;

import com.google.gwt.storage.client.Storage;

public class DefaultHTMLStorage implements HTMLStorage {
	
	private static Storage html5Store;

	static {
		html5Store = Storage.getLocalStorageIfSupported();
	}
	

	@Override
	public void putBoolean(String key, boolean value) {
		persistItem(key, String.valueOf(value));
	}

	@Override
	public void putString(String key, String value) {
		persistItem(key, String.valueOf(value));
	}

	@Override
	public void putLong(String key, long value) {
		persistItem(key, String.valueOf(value));
	}

	@Override
	public void putInt(String key, int value) {
		persistItem(key, String.valueOf(value));
	}

	@Override
	public boolean getBoolean(String key, boolean defaultValue) {
		String item = getSavedItem(key);
		if (item != null) {
			return Boolean.valueOf(item);
		}
		return defaultValue;
	}

	@Override
	public String getString(String key, String defaultValue) {
		String item = getSavedItem(key);
		if (item != null) {
			return item;
		}
		return defaultValue;
	}

	@Override
	public long getLong(String key, long defaultValue) {
		String item = getSavedItem(key);
		if (item != null) {
			return Long.valueOf(item);
		}
		return defaultValue;
	}

	@Override
	public int getInt(String key, int defaultValue) {
		String item = getSavedItem(key);
		if (item != null) {
			return Integer.valueOf(item);
		}
		return defaultValue;
	}
	
	@Override
	public boolean clearAllStorage() {
		try {
			html5Store.clear();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private void persistItem(String key, String value) {
		if (html5Store != null) {
			html5Store.setItem(key, value);
		}
	}
	
	private static String getSavedItem(String key) {
		if (html5Store != null) {
			return html5Store.getItem(key);
		}
		return null;
	}

	@Override
	public void putDouble(String key, double value) {
		persistItem(key, String.valueOf(value));
	}

	@Override
	public double getDouble(String key, double defaultValue) {
		String item = getSavedItem(key);
		if (item != null) {
			return Double.valueOf(item);
		}
		return defaultValue;
	}

}
