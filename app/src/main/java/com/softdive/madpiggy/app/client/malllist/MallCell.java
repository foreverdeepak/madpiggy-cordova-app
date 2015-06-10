package com.softdive.madpiggy.app.client.malllist;

import com.softdive.madpiggy.app.client.model.helper.MallWrapper;
import com.softdive.madpiggy.app.client.widget.celllist.Cell;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class MallCell implements Cell<MallWrapper> {

	@Override
	public CellWidget<MallWrapper> createWidget() {
		return new MallWidget();
	}

	@Override
	public boolean canBeSelected(MallWrapper model) {
		return false;
	}

}
