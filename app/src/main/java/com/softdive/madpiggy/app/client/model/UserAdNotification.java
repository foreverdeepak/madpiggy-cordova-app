package com.softdive.madpiggy.app.client.model;

public class UserAdNotification extends UserNotification {

	private Campaign campaign;
	private UserWallet userWallet;

	public UserWallet getUserWallet() {
		return userWallet;
	}

	public void setUserWallet(UserWallet userWallet) {
		this.userWallet = userWallet;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
