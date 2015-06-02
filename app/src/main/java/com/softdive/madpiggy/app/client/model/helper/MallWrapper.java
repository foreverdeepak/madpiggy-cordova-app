package com.softdive.madpiggy.app.client.model.helper;

import com.softdive.madpiggy.app.client.model.Mall;

public class MallWrapper {

	private Mall mall;
	private boolean isLiked;

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public boolean isLiked() {
		return isLiked;
	}

	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}

}
