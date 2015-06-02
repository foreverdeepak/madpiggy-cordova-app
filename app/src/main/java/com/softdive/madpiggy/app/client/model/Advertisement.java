package com.softdive.madpiggy.app.client.model;

import javax.validation.constraints.Size;
import java.util.Collection;

public class Advertisement extends Imageable {

	private long id;
	private long retailerId;
	private Company company;
	private String description;
	@Size(min = 1, max = 255) private String title;
	private AdType adType;
	private Collection<Preference> preferences;
	private int shares;
	private int earns;
	private int reviews;
	private transient double rating;
	private String edealUrl;
	private boolean allowOrder;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AdType getAdType() {
		return adType;
	}

	public void setAdType(AdType adType) {
		this.adType = adType;
	}

	public Collection<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Collection<Preference> preferences) {
		this.preferences = preferences;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(long retailerId) {
		this.retailerId = retailerId;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getEdealUrl() {
		return edealUrl;
	}

	public void setEdealUrl(String edealUrl) {
		this.edealUrl = edealUrl;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public static enum AdType {
		EDEAL, INSTORE
	}

	public boolean isAllowOrder() {
		return allowOrder;
	}

	public void setAllowOrder(boolean allowOrder) {
		this.allowOrder = allowOrder;
	}

}
