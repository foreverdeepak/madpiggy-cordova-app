package com.softdive.madpiggy.app.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

public class NotFound extends Composite {

	@UiField Label notFoundTitle;
	@UiField Label notFoundDesription;
	@UiField Element notFoundIcon;
	@UiField RootFlexPanel parent;

	private static NotFoundUiBinder uiBinder = GWT.create(NotFoundUiBinder.class);

	interface NotFoundUiBinder extends UiBinder<Widget, NotFound> {
	}

	

	public NotFound(String iconUri, String title, String description) {
		initWidget(uiBinder.createAndBindUi(this));
		initUI(iconUri, title, description);
	}

	private void initUI(String iconUri, String title, String description) {
		if (title != null && !title.trim().isEmpty()) {
			notFoundTitle.setText(title);
		} else {
			notFoundTitle.setText("Not Found");
		}

		if (description != null && !description.trim().isEmpty()) {
			notFoundDesription.setText(description);
		} else {
			notFoundDesription.setText("Not Found");
		}
		notFoundIcon.setAttribute("icon", iconUri);
		parent.getElement().setAttribute("style", "background: #373636;");
		parent.getElement().getStyle().setHeight(Window.getClientHeight() -128, Unit.PX);

	}

}
