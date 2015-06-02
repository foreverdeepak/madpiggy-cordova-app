package com.softdive.madpiggy.app.client.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Notification {

	private Map<Long, Campaign> campaigns = new HashMap<Long, Campaign>();
	private Map<Long, UserWallet> userWallets = new HashMap<Long, UserWallet>();

	private Collection<UserNotification> notifications = new LinkedList<UserNotification>();

	public Map<Long, Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(Map<Long, Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	public Map<Long, UserWallet> getUserWallets() {
		return userWallets;
	}

	public void setUserWallets(Map<Long, UserWallet> userWallets) {
		this.userWallets = userWallets;
	}

	public Collection<UserNotification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Collection<UserNotification> notifications) {
		this.notifications = notifications;
	}

}
