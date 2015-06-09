package com.softdive.madpiggy.app.client.model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

public class Voucher extends Imageable {

	private long id;
	@Size(min = 1, max = 30) private String title;
	@Size(min = 1, max = 30) private String subTitle;
	@Size(min = 1, max = 250) private String description;
	@Size(min = 1, max = 250) private String tnc;

	private long unitPoints;
	private long unitNegotiablePrice;

	@Digits(fraction = 0, integer = 20) private long totalVoucherUnits;
	private long soldVoucherUnits;
	private Company company;
	private Status status;
	@Future private Date expiryDate;
	private long modifiedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTnc() {
		return tnc;
	}

	public void setTnc(String tnc) {
		this.tnc = tnc;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public long getTotalVoucherUnits() {
		return totalVoucherUnits;
	}

	public void setTotalVoucherUnits(long totalVoucherUnits) {
		this.totalVoucherUnits = totalVoucherUnits;
	}

	public long getSoldVoucherUnits() {
		return soldVoucherUnits;
	}

	public void setSoldVoucherUnits(long soldVoucherUnits) {
		this.soldVoucherUnits = soldVoucherUnits;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getUnitPoints() {
		return unitPoints;
	}

	public void setUnitPoints(long unitPoints) {
		this.unitPoints = unitPoints;
	}

	public long getUnitNegotiablePrice() {
		return unitNegotiablePrice;
	}

	public void setUnitNegotiablePrice(long unitNegotiablePrice) {
		this.unitNegotiablePrice = unitNegotiablePrice;
	}

	public enum Status {
		WAITING_FOR_APPROVAL, APPROVED, REFUSED, APPROVED_BY_ADMIN, APPROVED_BY_MERCHANT
	}
}
