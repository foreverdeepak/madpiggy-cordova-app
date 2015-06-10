package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperOverlayElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayCloseCompletedEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenCompletedEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayCloseCompletedEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayOpenCompletedEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayOpenEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreOverlayPositionEventHandler;

public class PaperOverlay extends PolymerWidget {

	public PaperOverlay(String html) {
		this("core-overlay", html);
	}

	public PaperOverlay(String tag, String html) {
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

		getPolymerElement().addEventListener(PaperOverlayPositionEvent.NAME,
				new PaperOverlayPositionEvent.Listener() {

					@Override
					protected void handleEvent(PaperOverlayPositionEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayPositionEvent(
								event));
					}
				});

	}

	public PaperOverlayElement getPolymerElement() {
		return (PaperOverlayElement) getElement();
	}

	public Object getTarget() {
		return getPolymerElement().target();
	}

	public void setTarget(Object value) {
		getElement().setAttribute("target", String.valueOf(value));
	}

	public void setTarget(String target) {
		getElement().setAttribute("target", target);
	}

	public Object getSizingTarget() {
		return getPolymerElement().sizingTarget();
	}

	public void setSizingTarget(Object value) {
		getElement().setAttribute("sizingTarget", String.valueOf(value));
	}

	public void setSizingTarget(String sizingTarget) {
		getElement().setAttribute("sizingTarget", sizingTarget);
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

	public boolean isBackdrop() {
		return getPolymerElement().backdrop();
	}

	public void setBackdrop(boolean value) {
		getElement().setAttribute("backdrop", String.valueOf(value));
	}

	public void setBackdrop(String backdrop) {
		setBooleanAttribute("backdrop", true);
	}

	public boolean isLayered() {
		return getPolymerElement().layered();
	}

	public void setLayered(boolean value) {
		getElement().setAttribute("layered", String.valueOf(value));
	}

	public void setLayered(String layered) {
		setBooleanAttribute("layered", true);
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

	public boolean isAutoFocusDisabled() {
		return getPolymerElement().autoFocusDisabled();
	}

	public void setAutoFocusDisabled(boolean value) {
		getElement().setAttribute("autoFocusDisabled", String.valueOf(value));
	}

	public void setAutoFocusDisabled(String autoFocusDisabled) {
		setBooleanAttribute("autoFocusDisabled", true);
	}

	public String getCloseAttribute() {
		return getPolymerElement().closeAttribute();
	}

	public void setCloseAttribute(String value) {
		getElement().setAttribute("closeAttribute", String.valueOf(value));
	}

	public String getCloseSelector() {
		return getPolymerElement().closeSelector();
	}

	public void setCloseSelector(String value) {
		getElement().setAttribute("closeSelector", String.valueOf(value));
	}

	public String getTransition() {
		return getPolymerElement().transition();
	}

	public void setTransition(String value) {
		getElement().setAttribute("transition", String.valueOf(value));
	}

	public void toggle() {
		getPolymerElement().toggle();
	}

	public void open() {
		getPolymerElement().open();
	}

	public void close() {
		getPolymerElement().close();
	}

	public void resizeHandler() {
		getPolymerElement().resizeHandler();
	}

	public HandlerRegistration addCoreOverlayOpenHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenEvent.TYPE);
	}

	public HandlerRegistration addCoreOverlayOpenCompletedHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenCompletedEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayOpenCompletedEvent.TYPE);
	}

	public HandlerRegistration addCoreOverlayCloseCompletedHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayCloseCompletedEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayCloseCompletedEvent.TYPE);
	}

	public HandlerRegistration addCoreOverlayPositionHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayPositionEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperOverlayPositionEvent.TYPE);
	}

}
