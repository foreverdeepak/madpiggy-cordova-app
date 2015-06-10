package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.element.PaperCheckboxElement;
import com.softdive.madpiggy.app.client.polymer.element.event.ChangeEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreChangeEventHandler;

public class PaperCheckbox extends PaperRadioButton {

	public PaperCheckbox(String html) {
		this("paper-checkbox", html);
	}

	public PaperCheckbox(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(ChangeEvent.NAME,
				new ChangeEvent.Listener() {
					@Override
					protected void handleEvent(ChangeEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent(
								event));
					}
				});

		getPolymerElement().addEventListener(PaperChangeEvent.NAME,
				new PaperChangeEvent.Listener() {
					@Override
					protected void handleEvent(PaperChangeEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent(
								event));
					}
				});

	}

	public PaperCheckboxElement getPolymerElement() {
		return (PaperCheckboxElement) getElement();
	}

	public HandlerRegistration addChangeHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent.TYPE);
	}

	public HandlerRegistration addCoreChangeHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent.TYPE);
	}

}
