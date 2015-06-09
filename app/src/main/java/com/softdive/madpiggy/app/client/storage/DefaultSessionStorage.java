package com.softdive.madpiggy.app.client.storage;

import com.google.gwt.storage.client.Storage;

public class DefaultSessionStorage implements SessionStorage {
	
	private static final Storage sessionStore = Storage.getSessionStorageIfSupported();

	@Override
	public void putString(String key, String value) {
		sessionStore.setItem(key, value);
	}

	@Override
	public String getItem(String key) {
		return sessionStore.getItem(key);
	}

	@Override
	public void clearStorage(String key) {
		sessionStore.removeItem(key);
	}

}
