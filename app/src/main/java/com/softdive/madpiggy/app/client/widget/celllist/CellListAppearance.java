package com.softdive.madpiggy.app.client.widget.celllist;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.util.MGWTCssResource;

public interface CellListAppearance {

	interface CellListCss extends MGWTCssResource {

		@ClassName("mgwt-List")
		public String listCss();

		@ClassName("mgwt-List-entry")
		public String entry();

		@ClassName("mgwt-List-entry-selected")
		public String selected();

		@ClassName("mgwt-List-entry-first")
		public String first();

		@ClassName("mgwt-List-entry-last")
		public String last();

		@ClassName("mgwt-List-entry-canbeSelected")
		public String canbeSelected();

		@ClassName("mgwt-List-Head-Element")
		public String listHeadElement();

		@ClassName("mgwt-List-Header")
		String header();
	}

	CellListCss css();

	UiBinder<? extends Widget, CellList<?>> uiBinder();
}
