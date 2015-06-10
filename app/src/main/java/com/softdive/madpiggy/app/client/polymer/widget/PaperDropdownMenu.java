package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.element.PaperDropdownMenuElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;

public class PaperDropdownMenu extends CoreDropdownBase {

	public PaperDropdownMenu(String html) {
		this("paper-dropdown-menu", html);
	}

	public PaperDropdownMenu(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(PaperSelectEvent.NAME,
				new PaperSelectEvent.Listener() {
					@Override
					protected void handleEvent(PaperSelectEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent(
								event));
					}
				});

	}

	public PaperDropdownMenuElement getPolymerElement() {
		return (PaperDropdownMenuElement) getElement();
	}

	public String getLabel() {
		return getPolymerElement().label();
	}

	public void setLabel(String value) {
		getElement().setAttribute("label", String.valueOf(value));
	}

	public String getOpenedIcon() {
		return getPolymerElement().openedIcon();
	}

	public void setOpenedIcon(String value) {
		getElement().setAttribute("openedIcon", String.valueOf(value));
	}

	public String getClosedIcon() {
		return getPolymerElement().closedIcon();
	}

	public void setClosedIcon(String value) {
		getElement().setAttribute("closedIcon", String.valueOf(value));
	}

	public HandlerRegistration addCoreSelectHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent.TYPE);
	}

}
