package com.softdive.madpiggy.app.client.detail.deal;

import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.widget.celllist.Cell;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class ReviewCell implements Cell<AdReview> {

	@Override
	public CellWidget<AdReview> createWidget() {
		return new ReviewWidget();
	}

	@Override
	public boolean canBeSelected(AdReview model) {
		return false;
	}

}
