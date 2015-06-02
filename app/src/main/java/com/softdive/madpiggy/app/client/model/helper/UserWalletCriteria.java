package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.UserWallet.Action;
import com.softdive.madpiggy.app.client.model.UserWallet.TransactionType;

public class UserWalletCriteria {

	private Action action;
	private long userId;
	private TransactionType transactionType;
	private long lField1;

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getlField1() {
		return lField1;
	}

	public void setlField1(long lField1) {
		this.lField1 = lField1;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
}
