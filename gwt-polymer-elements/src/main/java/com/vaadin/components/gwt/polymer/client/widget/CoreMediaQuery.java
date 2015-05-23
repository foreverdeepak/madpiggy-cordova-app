package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreMediaQuery extends PolymerWidget {

    public CoreMediaQuery(String html) {
        this("core-media-query", html);
    }
    
    public CoreMediaQuery(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent event) {
                fireEvent(new CoreMediaChangeEvent(event));
            }
        });

    }

    public CoreMediaQueryElement getPolymerElement() {
        return (CoreMediaQueryElement) getElement();
    }
    

    public Object getQueryMatches() {
        return getPolymerElement().queryMatches();
    }
    public void setQueryMatches(Object value) {
        getElement().setAttribute("queryMatches", String.valueOf(value));
    }
    public void setQueryMatches(String queryMatches) {
        getElement().setAttribute("queryMatches", queryMatches);
    }

    public String getQuery() {
        return getPolymerElement().query();
    }
    public void setQuery(String value) {
        getElement().setAttribute("query", String.valueOf(value));
    }
    




    public HandlerRegistration addCoreMediaChangeHandler(CoreMediaChangeEventHandler handler) {
        return addHandler(handler, CoreMediaChangeEvent.TYPE);
    }

}
