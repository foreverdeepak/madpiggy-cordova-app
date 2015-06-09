package com.softdive.madpiggy.app.client.api;

import java.util.Collection;

import org.fusesource.restygwt.client.MethodCallback;

import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.OutletDealsWrapper;
import com.softdive.madpiggy.app.client.model.Source;
import com.softdive.madpiggy.app.client.model.UserActivity;
import com.softdive.madpiggy.app.client.model.UserActivity.Activity;
import com.softdive.madpiggy.app.client.model.UserBadgeInfo;
import com.softdive.madpiggy.app.client.model.UserWallet;
import com.softdive.madpiggy.app.client.model.helper.AdCriteria;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;
import com.softdive.madpiggy.app.client.model.helper.OutletCriteria;
import com.softdive.madpiggy.app.client.rest.SingleApi;

public class AdApi {

	private SingleApi singleApi;

	public AdApi(SingleApi singleApi) {
		this.singleApi = singleApi;
	}

	public void getAdsByCriteria(AdCriteria criteria, int offset, int pageSize, MethodCallback<Collection<Advertisement>> callback) {
		singleApi.getAdsByCriteria(criteria, offset, pageSize, callback);
	}

	public void getAdById(long id, MethodCallback<Advertisement> callback) {
		singleApi.getAdById(id, callback);
	}

	public void getAdReviews(long adId, int offset, int pageSize, MethodCallback<Collection<AdReview>> callback) {
		singleApi.getAdReviews(adId, offset, pageSize, callback);
	}

	public void getAdsByUserLikes(long userId, int offset, int pageSize, MethodCallback<Collection<Advertisement>> callback) {
		singleApi.getAdByUserLike(userId, offset, pageSize, callback);
	}

	public void getAdTags(int offset, int pageSize, MethodCallback<Collection<String>> callback) {
		singleApi.getAdTags(offset, pageSize, callback);
	}

	public void getOutletsByCriteria(OutletCriteria criteria, int offset, int pageSize, MethodCallback<Collection<Outlet>> callback) {
		singleApi.getOutletsByCriteria(criteria, offset, pageSize, callback);
	}

	public void createReview(long adId, AdReview adReview, MethodCallback<Void> callback) {
		singleApi.createReview(adId, adReview, callback);
	}

	public void pushUserActivity(long userId, long adId, Activity activity, MethodCallback<UserWallet> callback) {
		UserActivity userActivity = new UserActivity();
		userActivity.setSource(Source.AD);
		userActivity.setSourceId(adId);
		userActivity.setActivity(activity);
		userActivity.setUserId(userId);
		singleApi.pushUserActivity(userId, userActivity, callback);
	}

	public void getUserBadgeInfo(long userId, MethodCallback<UserBadgeInfo> callback) {
		singleApi.getUserBadgeInfo(userId, callback);
	}
	
	public void isUserNotificationExists(long userId, long adId, MethodCallback<Boolean> callback) {
		singleApi.isUserNotificationExists(userId, adId, callback);
	}
	
	public void getAdsByMallId(long mallId, int offset, int pageSize, MethodCallback<Collection<Advertisement>> callback) {
		singleApi.getAdsByMallId(mallId, offset, pageSize, callback);
	}
	
	public void getDealWrapper(AdCriteria adCriteria, int offset, int pagesize, MethodCallback<DealWrapper> callback) {
		singleApi.getAdDealWrapperByCriteria(adCriteria, offset, pagesize, callback);
	}
	
	public void getOutletDealsWrapper(long outletId, MethodCallback<OutletDealsWrapper> callback) {
		singleApi.getOutletDealsWrapper(outletId, callback);
	}

}
