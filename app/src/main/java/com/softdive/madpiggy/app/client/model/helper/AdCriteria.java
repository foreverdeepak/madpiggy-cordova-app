package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Advertisement.AdType;
import com.softdive.madpiggy.app.client.model.UserActivity.Activity;

import java.util.Collection;
import java.util.Date;

public class AdCriteria {

	private Collection<Long> companyIds;
	private AdType adType;
	private Collection<Long> adIds;
	private long retailerId;
	private Activity activity;
	private String searchText;
	private GeoCriteria geoCriteria;
	private Collection<String> tags;
	private long minAge;
	private long maxAge;
	private Date currentTimeStamp;
	private GeoCriteria edealGeoCriteria;
	private long countryCode;
	private Collection<String> beaconIds;
	private long userId;
	private Collection<String> categories;

	public Collection<String> getBeaconIds() {
		return beaconIds;
	}

	public void setBeaconIds(Collection<String> beaconIds) {
		this.beaconIds = beaconIds;
	}

	public AdType getAdType() {
		return adType;
	}

	public void setAdType(AdType adType) {
		this.adType = adType;
	}

	public Collection<Long> getCompanyIds() {
		return companyIds;
	}

	public void setCompanyIds(Collection<Long> companyIds) {
		this.companyIds = companyIds;
	}

	public GeoCriteria getGeoCriteria() {
		if (geoCriteria == null) {
			geoCriteria = new GeoCriteria();
		}
		return geoCriteria;
	}

	public void setGeoCriteria(GeoCriteria geoCriteria) {
		this.geoCriteria = geoCriteria;
	}

	public Collection<Long> getAdIds() {
		return adIds;
	}

	public void setAdIds(Collection<Long> adIds) {
		this.adIds = adIds;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(long retailerId) {
		this.retailerId = retailerId;
	}

	public Collection<String> getTags() {
		return tags;
	}

	public void setTags(Collection<String> tags) {
		this.tags = tags;
	}

	public long getMinAge() {
		return minAge;
	}

	public void setMinAge(long minAge) {
		this.minAge = minAge;
	}

	public long getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(long maxAge) {
		this.maxAge = maxAge;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public Date getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	public void setCurrentTimeStamp(Date currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}

	public void setEdealGeoCriteria(GeoCriteria edealGeoCriteria) {
		this.edealGeoCriteria = edealGeoCriteria;
	}

	public GeoCriteria getEdealGeoCriteria() {
		return edealGeoCriteria;
	}

	public long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(long countryCode) {
		this.countryCode = countryCode;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public void setCategories(Collection<String> categories) {
		this.categories = categories;
	}
	
	public Collection<String> getCategories() {
		return categories;
	}

}
