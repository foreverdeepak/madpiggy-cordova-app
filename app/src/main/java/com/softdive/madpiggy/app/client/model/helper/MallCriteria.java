package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;
import java.util.Date;

public class MallCriteria {

	private Collection<Long> outletIds;
	private long mallId;
	private Date startDate;
	private Date endDate;
	private String mallName;
	private String email;
	private String city;
	private GeoCriteria geoCriteria;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public Collection<Long> getOutletIds() {
		return outletIds;
	}

	public void setOutletIds(Collection<Long> outletIds) {
		this.outletIds = outletIds;
	}

	public long getMallId() {
		return mallId;
	}

	public void setMallId(long mallId) {
		this.mallId = mallId;
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
	
	public GeoCriteria getGeoCriteria() {
		return geoCriteria;
	}
	
	public void setGeoCriteria(GeoCriteria geoCriteria) {
		this.geoCriteria = geoCriteria;
	}

}
