package com.softdive.madpiggy.app.client.widget.celllist;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class DefaultCellListAppearance implements CellListAppearance {

	static {
		Resources.INSTANCE.css().ensureInjected();
	}

	interface Resources extends ClientBundle {

		Resources INSTANCE = GWT.create(Resources.class);

		@Source({ "celllist.css" })
		CellListCss css();

		@Source("arrow.png")
		DataResource listArrow();
	}

	@UiTemplate("CellListBaseAppearance.ui.xml")
	interface Binder extends UiBinder<Widget, CellList<?>> {
	}

	private static final Binder UI_BINDER = GWT.create(Binder.class);

	@Override
	public UiBinder<? extends Widget, CellList<?>> uiBinder() {
		return UI_BINDER;
	}

	@Override
	public CellListCss css() {
		return Resources.INSTANCE.css();
	}
}
