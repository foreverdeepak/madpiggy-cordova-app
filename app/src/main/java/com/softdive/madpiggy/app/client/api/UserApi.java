package com.softdive.madpiggy.app.client.api;

import java.util.Collection;

import javax.ws.rs.PathParam;

import org.fusesource.restygwt.client.MethodCallback;

import com.softdive.madpiggy.app.client.model.Feedback;
import com.softdive.madpiggy.app.client.model.Notification;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.UserActivity;
import com.softdive.madpiggy.app.client.model.UserBadgeInfo;
import com.softdive.madpiggy.app.client.model.UserCheckInWrapper;
import com.softdive.madpiggy.app.client.model.UserWallet;
import com.softdive.madpiggy.app.client.model.helper.FavouritePreferences;
import com.softdive.madpiggy.app.client.model.helper.UserActivityCriteria;
import com.softdive.madpiggy.app.client.rest.SingleApi;

public class UserApi {

	SingleApi singleApi;

	public UserApi(SingleApi singleApi) {
		this.singleApi = singleApi;
	}

	public void getUserBadgeInfo(long userId, MethodCallback<UserBadgeInfo> callback) {
		singleApi.getUserBadgeInfo(userId, callback);
	}

	public void getUserPoints(long userId, MethodCallback<Long> callback) {
		singleApi.getUserPoints(userId, callback);
	}

	public void getUserByUserId(long userId, MethodCallback<User> callback) {
		singleApi.getUserByUserId(userId, callback);
	}

	public void getWalletsByUserId(long userId, int offset, int pageSize, MethodCallback<Collection<UserWallet>> callback) {
		singleApi.getWalletsByUserId(userId, offset, pageSize, callback);
	}

	public void getUserNotifications(long userId, int offset, int pageSize, MethodCallback<Notification> callback) {
		singleApi.getUserNotifications(userId, offset, pageSize, callback);
	}

	public void markNotificationRead(long userId, long notificationId, MethodCallback<Void> callback) {
		singleApi.markNotificationRead(userId, notificationId, callback);
	}

	public void submitFeedBack(Feedback feedback, MethodCallback<Void> callback) {
		singleApi.submitFeedBack(feedback, callback);
	}

	public void getActivities(UserActivityCriteria criteria, int offset, int pageSize, MethodCallback<Collection<UserActivity>> callback) {
		singleApi.getActivities(criteria, offset, pageSize, callback);
	}

	public void updateUser(@PathParam("userId") long userId, User user, MethodCallback<Void> callback) {
		singleApi.updateUser(userId, user, callback);
	}
	
	public void getUserCheckInHistory(long userId, MethodCallback<Collection<UserCheckInWrapper>> callback) {
		singleApi.getUserCheckInHistory(userId, callback);
	}
	
	public void pushUserActivity(long userId,  UserActivity activity, MethodCallback<UserWallet> callback) {
		singleApi.pushUserActivity(userId, activity, callback);
	}

	public void updateFavourite(long userId, FavouritePreferences favouritePreferences,  MethodCallback<Collection<com.softdive.madpiggy.app.client.model.Preference>> callback) {
		singleApi.updateFavourite(userId,favouritePreferences, callback);
	}
}
