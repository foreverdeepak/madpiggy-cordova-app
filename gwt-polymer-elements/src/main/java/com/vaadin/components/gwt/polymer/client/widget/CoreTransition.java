package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreTransition extends CoreMeta {

    public CoreTransition(String html) {
        this("core-transition", html);
    }
    
    public CoreTransition(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent event) {
                fireEvent(new CoreTransitionendEvent(event));
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


    public HandlerRegistration addCoreTransitionendHandler(CoreTransitionendEventHandler handler) {
        return addHandler(handler, CoreTransitionendEvent.TYPE);
    }

}
