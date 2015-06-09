package com.softdive.madpiggy.app.client.dealslisting;

import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.widget.celllist.Cell;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class DealCell implements Cell<Advertisement> {

	@Override
	public boolean canBeSelected(Advertisement model) {
		return true;
	}

	@Override
	public CellWidget<Advertisement> createWidget() {
		return new DealWidget();
	}
}
