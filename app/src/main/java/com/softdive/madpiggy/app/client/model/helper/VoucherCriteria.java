package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Voucher.Status;

import java.util.Collection;

public class VoucherCriteria {

	private Collection<Long> voucherIds;
	private Collection<Long> companyIds;
	private Collection<Status> status;
	private GeoCriteria geoCriteria;
	private long countryCode;

	public Collection<Long> getVoucherIds() {
		return voucherIds;
	}

	public void setVoucherIds(Collection<Long> voucherIds) {
		this.voucherIds = voucherIds;
	}

	public Collection<Long> getCompanyIds() {
		return companyIds;
	}

	public void setCompanyIds(Collection<Long> companyIds) {
		this.companyIds = companyIds;
	}

	public Collection<Status> getStatus() {
		return status;
	}

	public void setStatus(Collection<Status> status) {
		this.status = status;
	}

	public void setGeoCriteria(GeoCriteria geoCriteria) {
		this.geoCriteria = geoCriteria;
	}

	public GeoCriteria getGeoCriteria() {
		return geoCriteria;
	}

	public long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(long countryCode) {
		this.countryCode = countryCode;
	}
}
