package com.softdive.madpiggy.app.client.model.helper;

import java.io.Serializable;

public class DealOutlet implements Serializable {

	private static final long serialVersionUID = 1L;

	private long dealId;
	private long outletId;

	public long getDealId() {
		return dealId;
	}

	public void setDealId(long dealId) {
		this.dealId = dealId;
	}

	public long getOutletId() {
		return outletId;
	}

	public void setOutletId(long outletId) {
		this.outletId = outletId;
	}
}
