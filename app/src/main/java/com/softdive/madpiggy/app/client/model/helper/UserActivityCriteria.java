package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;

import com.softdive.madpiggy.app.client.model.Source;
import com.softdive.madpiggy.app.client.model.UserActivity.Activity;

public class UserActivityCriteria {

	private Source source;
	private Collection<Long> sourceIds;
	private long userId;
	private Activity activity;

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Collection<Long> getSourceIds() {
		return sourceIds;
	}

	public void setSourceIds(Collection<Long> sourceIds) {
		this.sourceIds = sourceIds;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
}
