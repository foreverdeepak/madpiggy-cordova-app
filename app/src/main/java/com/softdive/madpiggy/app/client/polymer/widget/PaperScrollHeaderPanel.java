package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreScrollHeaderPanelElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperHeaderTransformEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.ScrollEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreHeaderTransformEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEventHandler;

public class PaperScrollHeaderPanel extends PolymerWidget {

	public PaperScrollHeaderPanel(String html) {
		this("paper-scroll-header-panel", html);
	}

	public PaperScrollHeaderPanel(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(ScrollEvent.NAME, 	new ScrollEvent.Listener(){

			@Override
			protected void handleEvent(ScrollEvent event) {
					fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEvent(event));				
			}});

		getPolymerElement().addEventListener(PaperHeaderTransformEvent.NAME,new PaperHeaderTransformEvent.Listener() {

			@Override
			protected void handleEvent(PaperHeaderTransformEvent event) {
				fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperHeaderTransformEvent(event));
			}
			
		});
							

	}

	public CoreScrollHeaderPanelElement getPolymerElement() {
		return (CoreScrollHeaderPanelElement) getElement();
	}

	public boolean isCondenses() {
		return getPolymerElement().condenses();
	}

	public void setCondenses(boolean value) {
		getElement().setAttribute("condenses", String.valueOf(value));
	}

	public void setCondenses(String condenses) {
		setBooleanAttribute("condenses", true);
	}

	public boolean isNoDissolve() {
		return getPolymerElement().noDissolve();
	}

	public void setNoDissolve(boolean value) {
		getElement().setAttribute("noDissolve", String.valueOf(value));
	}

	public void setNoDissolve(String noDissolve) {
		setBooleanAttribute("noDissolve", true);
	}

	public boolean isNoReveal() {
		return getPolymerElement().noReveal();
	}

	public void setNoReveal(boolean value) {
		getElement().setAttribute("noReveal", String.valueOf(value));
	}

	public void setNoReveal(String noReveal) {
		setBooleanAttribute("noReveal", true);
	}

	public boolean isFixed() {
		return getPolymerElement().fixed();
	}

	public void setFixed(boolean value) {
		getElement().setAttribute("fixed", String.valueOf(value));
	}

	public void setFixed(String fixed) {
		setBooleanAttribute("fixed", true);
	}

	public boolean isKeepCondensedHeader() {
		return getPolymerElement().keepCondensedHeader();
	}

	public void setKeepCondensedHeader(boolean value) {
		getElement().setAttribute("keepCondensedHeader", String.valueOf(value));
	}

	public void setKeepCondensedHeader(String keepCondensedHeader) {
		setBooleanAttribute("keepCondensedHeader", true);
	}

	public double getHeaderHeight() {
		return getPolymerElement().headerHeight();
	}

	public void setHeaderHeight(double value) {
		getElement().setAttribute("headerHeight", String.valueOf(value));
	}

	public void setHeaderHeight(String headerHeight) {
		getElement().setAttribute("headerHeight", headerHeight);
	}

	public double getCondensedHeaderHeight() {
		return getPolymerElement().condensedHeaderHeight();
	}

	public void setCondensedHeaderHeight(double value) {
		getElement().setAttribute("condensedHeaderHeight",
				String.valueOf(value));
	}

	public void setCondensedHeaderHeight(String condensedHeaderHeight) {
		getElement().setAttribute("condensedHeaderHeight",
				condensedHeaderHeight);
	}

	public boolean isScrollAwayTopbar() {
		return getPolymerElement().scrollAwayTopbar();
	}

	public void setScrollAwayTopbar(boolean value) {
		getElement().setAttribute("scrollAwayTopbar", String.valueOf(value));
	}

	public void setScrollAwayTopbar(String scrollAwayTopbar) {
		setBooleanAttribute("scrollAwayTopbar", true);
	}

	public Object getScroller() {
		return getPolymerElement().scroller();
	}

	public void setScroller(Object value) {
		getPolymerElement().scroller(value);
	}

	public void measureHeaderHeight() {
		getPolymerElement().measureHeaderHeight();
	}

	public HandlerRegistration addScrollHandler(ScrollEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEvent.TYPE);
	}

	public HandlerRegistration addCoreHeaderTransformHandler(
			com.softdive.madpiggy.app.client.polymer.widget.event.PaperHeaderTransformEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperHeaderTransformEvent.TYPE);
	}

}
