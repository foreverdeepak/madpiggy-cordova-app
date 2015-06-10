package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperToastElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayCloseCompletedEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenCompletedEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayCloseCompletedEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayOpenCompletedEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayOpenEventHandler;

public class PaperToast extends PolymerWidget {

	public PaperToast(String html) {
		this("paper-toast", html);
	}

	public PaperToast(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(PaperOverlayOpenEvent.NAME,
				new PaperOverlayOpenEvent.Listener() {

					@Override
					protected void handleEvent(PaperOverlayOpenEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenEvent(
								event));

					}
				});

		getPolymerElement().addEventListener(
				PaperOverlayOpenCompletedEvent.NAME,
				new PaperOverlayOpenCompletedEvent.Listener() {
					@Override
					protected void handleEvent(
							PaperOverlayOpenCompletedEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenCompletedEvent(
								event));
					}
				});

		getPolymerElement().addEventListener(
				PaperOverlayCloseCompletedEvent.NAME,
				new PaperOverlayCloseCompletedEvent.Listener() {
					@Override
					protected void handleEvent(
							PaperOverlayCloseCompletedEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayCloseCompletedEvent(
								event));
					}
				});

	}

	public PaperToastElement getPolymerElement() {
		return (PaperToastElement) getElement();
	}

	public String getText() {
		return getPolymerElement().text();
	}

	public void setText(String value) {
		getElement().setAttribute("text", String.valueOf(value));
	}

	public double getDuration() {
		return getPolymerElement().duration();
	}

	public void setDuration(double value) {
		getElement().setAttribute("duration", String.valueOf(value));
	}

	public void setDuration(String duration) {
		getElement().setAttribute("duration", duration);
	}

	public boolean isOpened() {
		return getPolymerElement().opened();
	}

	public void setOpened(boolean value) {
		getElement().setAttribute("opened", String.valueOf(value));
	}

	public void setOpened(String opened) {
		setBooleanAttribute("opened", true);
	}

	public String getResponsiveWidth() {
		return getPolymerElement().responsiveWidth();
	}

	public void setResponsiveWidth(String value) {
		getElement().setAttribute("responsiveWidth", String.valueOf(value));
	}

	public boolean isSwipeDisabled() {
		return getPolymerElement().swipeDisabled();
	}

	public void setSwipeDisabled(boolean value) {
		getElement().setAttribute("swipeDisabled", String.valueOf(value));
	}

	public void setSwipeDisabled(String swipeDisabled) {
		setBooleanAttribute("swipeDisabled", true);
	}

	public boolean isAutoCloseDisabled() {
		return getPolymerElement().autoCloseDisabled();
	}

	public void setAutoCloseDisabled(boolean value) {
		getElement().setAttribute("autoCloseDisabled", String.valueOf(value));
	}

	public void setAutoCloseDisabled(String autoCloseDisabled) {
		setBooleanAttribute("autoCloseDisabled", true);
	}

	public void toggle() {
		getPolymerElement().toggle();
	}

	public void show() {
		getPolymerElement().show();
	}

	public void dismiss() {
		getPolymerElement().dismiss();
	}

	public HandlerRegistration addCoreOverlayOpenHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenEvent.TYPE);
	}

	public HandlerRegistration addCoreOverlayOpenCompletedHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenCompletedEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenCompletedEvent.TYPE);
	}

	public HandlerRegistration addCoreOverlayCloseCompletedHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayCloseCompletedEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayCloseCompletedEvent.TYPE);
	}

}
