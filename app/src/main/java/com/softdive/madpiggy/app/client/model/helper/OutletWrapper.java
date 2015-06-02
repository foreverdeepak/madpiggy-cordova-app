package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Outlet;

public class OutletWrapper {
	private Outlet outlet;
	private boolean isLiked;

	public Outlet getOutlet() {
		return outlet;
	}

	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}

	public boolean isLiked() {
		return isLiked;
	}

	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}
}
