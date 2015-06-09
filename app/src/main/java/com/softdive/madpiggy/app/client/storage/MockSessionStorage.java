package com.softdive.madpiggy.app.client.storage;

import java.util.HashMap;
import java.util.Map;

public class MockSessionStorage implements SessionStorage {
	
	Map<String, String> keyVal = new HashMap<String, String>();

	@Override
	public void putString(String key, String value) {
		keyVal.put(key, value);
	}

	@Override
	public String getItem(String key) {
		return keyVal.get(key);
	}

	@Override
	public void clearStorage(String key) {
		keyVal.clear();
	}

}
