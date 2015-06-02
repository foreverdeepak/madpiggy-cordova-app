package com.softdive.madpiggy.app.client.model;

import java.util.Collection;
import java.util.Date;

public class Campaign extends Persistable {

	private long id;
	private Advertisement ad;
	private Date startDate;
	private Date endDate;
	private long capLimit;
	private State state;
	private long modifiedBy;
	private int shares;
	private int earns;
	private int reviews;
	private String name;
	private Collection<Preference> preferences;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Advertisement getAd() {
		return ad;
	}

	public void setAd(Advertisement ad) {
		this.ad = ad;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getCapLimit() {
		return capLimit;
	}

	public void setCapLimit(long capLimit) {
		this.capLimit = capLimit;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public int getEarns() {
		return earns;
	}

	public void setEarns(int earns) {
		this.earns = earns;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

	public Collection<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Collection<Preference> preferences) {
		this.preferences = preferences;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}
}
