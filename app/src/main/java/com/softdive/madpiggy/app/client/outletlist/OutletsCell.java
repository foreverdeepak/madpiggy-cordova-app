package com.softdive.madpiggy.app.client.outletlist;

import com.softdive.madpiggy.app.client.model.helper.OutletWrapper;
import com.softdive.madpiggy.app.client.widget.celllist.Cell;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class OutletsCell implements Cell<OutletWrapper> {

	@Override
	public CellWidget<OutletWrapper> createWidget() {
		return new OutletListWidget();
	}

	@Override
	public boolean canBeSelected(OutletWrapper model) {
		return false;
	}

}
