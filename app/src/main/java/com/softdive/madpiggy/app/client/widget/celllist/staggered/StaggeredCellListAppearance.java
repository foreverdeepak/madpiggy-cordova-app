package com.softdive.madpiggy.app.client.widget.celllist.staggered;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;
import com.softdive.madpiggy.app.client.widget.celllist.CellListAppearance;

public class StaggeredCellListAppearance implements CellListAppearance {

	@UiTemplate("StaggeredAppearance.ui.xml")
	interface Binder extends UiBinder<Widget, CellList<?>> {
	}

	private static final Binder UI_BINDER = GWT.create(Binder.class);

	@Override
	public UiBinder<? extends Widget, CellList<?>> uiBinder() {
		return UI_BINDER;
	}

	@Override
	public CellListCss css() {
		return null;
	}
}
