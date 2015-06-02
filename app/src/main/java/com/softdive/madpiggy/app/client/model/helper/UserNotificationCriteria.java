package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Source;

public class UserNotificationCriteria {

	private long userId;
	private Source source;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
}
