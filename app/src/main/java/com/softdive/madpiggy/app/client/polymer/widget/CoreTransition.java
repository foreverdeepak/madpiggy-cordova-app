package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.element.CoreTransitionElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent;

public class CoreTransition extends CoreMeta {

	public CoreTransition(String html) {
		this("core-transition", html);
	}

	public CoreTransition(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(PaperTransitionendEvent.NAME,
				new PaperTransitionendEvent.Listener() {

					@Override
					protected void handleEvent(PaperTransitionendEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEvent(
								event));
					}
				});

	}

	public CoreTransitionElement getPolymerElement() {
		return (CoreTransitionElement) getElement();
	}

	public void go(Object node, Object state) {
		getPolymerElement().go(node, state);
	}

	public void setup(Object node) {
		getPolymerElement().setup(node);
	}

	public void teardown(Object node) {
		getPolymerElement().teardown(node);
	}

	public void complete(Object node) {
		getPolymerElement().complete(node);
	}

	public void listenOnce(Object node, String event, Object fn, Object args) {
		getPolymerElement().listenOnce(node, event, fn, args);
	}

	public HandlerRegistration addCoreTransitionendHandler(com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEventHandler handler) {
		return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEvent.TYPE);
	}

}
