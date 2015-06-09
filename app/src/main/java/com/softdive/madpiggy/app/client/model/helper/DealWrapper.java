package com.softdive.madpiggy.app.client.model.helper;

import java.util.ArrayList;
import java.util.Collection;

import com.softdive.madpiggy.app.client.model.AdDto;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Outlet;

public class DealWrapper {

	private Collection<AdDto> adDtos;
	private Collection<Outlet> outlets;
	private Collection<Mall> malls;
	private Collection<Category> categories;
	private Collection<DealOutlet> dealOutletMapping;
	private Collection<Advertisement> advertisements;

	public Collection<AdDto> getAdDtos() {
		return adDtos;
	}

	public void setAdDtos(Collection<AdDto> adDtos) {
		this.adDtos = adDtos;
	}

	public Collection<Outlet> getOutlets() {
		return outlets;
	}

	public void setOutlets(Collection<Outlet> outlets) {
		this.outlets = outlets;
	}

	public Collection<Mall> getMalls() {
		return malls;
	}

	public void setMalls(Collection<Mall> malls) {
		this.malls = malls;
	}
	
	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}
	
	public Collection<Category> getCategories() {
		return categories;
	}
	
	public Collection<DealOutlet> getDealOutletMapping() {
		return dealOutletMapping;
	}
	
	public void setDealOutletMapping(Collection<DealOutlet> dealOutletMapping) {
		this.dealOutletMapping = dealOutletMapping;
	}
	
	public Collection<Advertisement> getAdvertisements() {
		if (advertisements != null) return advertisements;
		
		if (adDtos == null || adDtos.size() == 0) return null;
		
		Collection<Advertisement> exclusiveAds = new ArrayList<Advertisement>();
		Collection<Advertisement> ads = new ArrayList<Advertisement>();
		for (AdDto dto : adDtos) {
			if (dto.getAdvertisement().isExclusive()){
				exclusiveAds.add(dto.getAdvertisement());
			} else {
				ads.add(dto.getAdvertisement());
			}
		}
		
		exclusiveAds.addAll(ads);
		
		setAdvertisements(exclusiveAds);
		
		return exclusiveAds;
	}
	
	public void setAdvertisements(Collection<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}
	
}
