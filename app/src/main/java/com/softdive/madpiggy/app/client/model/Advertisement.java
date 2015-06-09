package com.softdive.madpiggy.app.client.model;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Size;

public class Advertisement extends Imageable {

	private long id;
	private long retailerId;
	private Company company;
	private String description;
	@Size(min = 1, max = 255)
	private String title;
	private AdType adType;
	private String category;
	private Collection<Preference> preferences;
	private int shares;
	private int earns;
	private int reviews;
	private transient double rating;
	private String edealUrl;
	private boolean allowOrder;
	private Date startDate;
	private Date endDate;
	private long mallId;
	
	private TimeRange timeRange;
	private Collection<WeekDay> applicableDays;
	private boolean allowCoupons;
	
	private String timeRangeStr;
	private String applicableDaysStr;
	
	private boolean exclusive;

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

	public long getMallId() {
		return mallId;
	}

	public void setMallId(long mallId) {
		this.mallId = mallId;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public TimeRange getTimeRange() {
		if (timeRange == null && timeRangeStr != null) {
			timeRange = TimeRange.fromString(timeRangeStr);
		}
		return timeRange;
	}

	public void setTimeRange(TimeRange timeRange) {
		this.timeRange = timeRange;
		this.timeRangeStr = this.timeRange.toString();
	}

	public Collection<WeekDay> getApplicableDays() {
		if (applicableDays == null && applicableDaysStr != null) {
			applicableDays = WeekDay.getApplicableDays(applicableDaysStr);
		}
		return applicableDays;
	}

	public void setApplicableDays(Collection<WeekDay> applicableDays) {
		this.applicableDays = applicableDays;
		this.applicableDaysStr = WeekDay.toString(applicableDays);
	}
	
	public boolean isAllowCoupons() {
		return allowCoupons;
	}

	public void setAllowCoupons(boolean allowCoupons) {
		this.allowCoupons = allowCoupons;
	}

	public String getTimeRangeStr() {
		return timeRangeStr;
	}

	public void setTimeRangeStr(String timeRangeStr) {
		this.timeRangeStr = timeRangeStr;
		this.timeRange = TimeRange.fromString(timeRangeStr);
	}

	public String getApplicableDaysStr() {
		return applicableDaysStr;
	}

	public void setApplicableDaysStr(String applicableDaysStr) {
		this.applicableDaysStr = applicableDaysStr;
		this.applicableDays = WeekDay.getApplicableDays(applicableDaysStr);
	}

	public boolean isExclusive() {
		return isAllowCoupons();
	}

	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}
	
}
