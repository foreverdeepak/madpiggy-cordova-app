package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperSelectionElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEventHandler;

public class PaperSelection extends PolymerWidget {

	public PaperSelection(String html) {
		this("core-selection", html);
	}

	public PaperSelection(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(PaperSelectEvent.NAME,
				new PaperSelectEvent.Listener() {

					@Override
					protected void handleEvent(PaperSelectEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent(event));
					}
				});

	}

	public PaperSelectionElement getPolymerElement() {
		return (PaperSelectionElement) getElement();
	}

	public boolean isMulti() {
		return getPolymerElement().multi();
	}

	public void setMulti(boolean value) {
		getElement().setAttribute("multi", String.valueOf(value));
	}

	public void setMulti(String multi) {
		setBooleanAttribute("multi", true);
	}

	public void getSelection() {
		getPolymerElement().getSelection();
	}

	public void isSelected(Object item) {
		getPolymerElement().isSelected(item);
	}

	public void select() {
		getPolymerElement().select();
	}

	public void toggle() {
		getPolymerElement().toggle();
	}

	public HandlerRegistration addCoreSelectHandler(
			PaperSelectEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent.TYPE);
	}

}
