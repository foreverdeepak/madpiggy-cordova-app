package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.AdDto;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Outlet;

import java.util.Collection;

public class DealWrapper {

	private Collection<AdDto> adDtos;
	private Collection<Outlet> outlets;
	private Collection<Mall> malls;

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

}
