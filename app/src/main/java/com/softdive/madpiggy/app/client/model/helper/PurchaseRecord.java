package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.VoucherOrder;

public class PurchaseRecord {

	private long voucherId;
	private int count;
	private VoucherOrder voucherOrder;

	public long getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(long voucherId) {
		this.voucherId = voucherId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public VoucherOrder getVoucherOrder() {
		return voucherOrder;
	}

	public void setVoucherOrder(VoucherOrder voucherOrder) {
		this.voucherOrder = voucherOrder;
	}

}
