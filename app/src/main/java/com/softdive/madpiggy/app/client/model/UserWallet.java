package com.softdive.madpiggy.app.client.model;

import java.util.Date;

public class UserWallet {

	private long id;
	private long userId;
	private TransactionType transactionType;
	private Action action;
	private long points;
	private Long lField1;
	private Long lField2;
	private Long lField3;
	private String sField1;
	private String sField2;
	private String sField3;
	private Date created;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public long getPoints() {
		return points;
	}

	public void setPoints(long points) {
		this.points = points;
	}

	public Long getlField1() {
		return lField1;
	}

	public void setLField1(Long lField1) {
		this.lField1 = lField1;
	}

	public Long getlField2() {
		return lField2;
	}

	public void setLField2(Long lField2) {
		this.lField2 = lField2;
	}

	public Long getlField3() {
		return lField3;
	}

	public void setLField3(Long lField3) {
		this.lField3 = lField3;
	}

	public String getsField1() {
		return sField1;
	}

	public void setSField1(String sField1) {
		this.sField1 = sField1;
	}

	public String getsField2() {
		return sField2;
	}

	public void setSField2(String sField2) {
		this.sField2 = sField2;
	}

	public String getsField3() {
		return sField3;
	}

	public void setSField3(String sField3) {
		this.sField3 = sField3;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public static enum TransactionType {
		DEBIT, CREDIT
	}

	public static enum Action {
		CAMPAIGN_ACTIVITY, TRANSFER, CAMPAIGN_LOGIN, PURCHASE, CHILD_CAMPAIGN_EARNING, NETWORK_JOIN, CHECK_IN_CAMPAIGN_ACTIVITY, PARENT_ADDED
	}
}
