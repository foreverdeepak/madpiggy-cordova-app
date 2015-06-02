package com.softdive.madpiggy.app.client.model;

public class CampaignSummaryReport {

	private long campaignId;
	private long shares;
	private long earns;
	private long facebookShare;
	private long googleShare;
	private long totalNotifiedUsers;
	private long totalParticipatedUsers;

	public long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(long campaignId) {
		this.campaignId = campaignId;
	}

	public long getShares() {
		return shares;
	}

	public void setShares(long shares) {
		this.shares = shares;
	}

	public long getEarns() {
		return earns;
	}

	public void setEarns(long earns) {
		this.earns = earns;
	}

	public long getFacebookShare() {
		return facebookShare;
	}

	public void setFacebookShare(long facebookShare) {
		this.facebookShare = facebookShare;
	}

	public long getGoogleShare() {
		return googleShare;
	}

	public void setGoogleShare(long googleShare) {
		this.googleShare = googleShare;
	}

	public long getTotalNotifiedUsers() {
		return totalNotifiedUsers;
	}

	public void setTotalNotifiedUsers(long totalNotifiedUsers) {
		this.totalNotifiedUsers = totalNotifiedUsers;
	}

	public long getTotalParticipatedUsers() {
		return totalParticipatedUsers;
	}

	public void setTotalParticipatedUsers(long totalParticipatedUsers) {
		this.totalParticipatedUsers = totalParticipatedUsers;
	}

}
