package com.softdive.madpiggy.app.client.model;

import java.util.Collection;
import java.util.Date;

public class UserActivity {

	private long id;
	private long userId;
	private Source source;
	private long sourceId;
	private Activity activity;
	private Date created;
	private Collection<Preference> activityData;
	private NotificationStatus notificationStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

	public Collection<Preference> getActivityData() {
		return activityData;
	}

	public void setActivityData(Collection<Preference> activityData) {
		this.activityData = activityData;
	}

	public NotificationStatus getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatus notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public static enum NotificationStatus {
		IN_PROCESS, COMPLETED, ERROR
	}

	public static enum Activity {
		LIKE, 
		UNLIKE,
		EARN,
		SHARE_FACEBOOK,
		SHARE_GOOGLE_PLUS,
		SHARE_TWITTER, 
		REVIEW,
		PARENT_ADDED, 
		CHECK_IN,
		ORIGINAL_PARENT_INVITATION,
		CHILD_DELETED, 
		POINTS_TRANSFER, 
		NETWORK_JOINED, 
		CAMPAIGN_CREATED,
		MALL_TO_USER_NOTIFICATION,
		MERCHANT_TO_USER_NOTIFICATION,
		AD_CREATED;
	}
}
