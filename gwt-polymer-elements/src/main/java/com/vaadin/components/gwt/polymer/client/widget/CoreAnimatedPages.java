package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreAnimatedPages extends CoreSelector {

    public CoreAnimatedPages(String html) {
        this("core-animated-pages", html);
    }
    
    public CoreAnimatedPages(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent event) {
                fireEvent(new CoreAnimatedPagesTransitionPrepareEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent event) {
                fireEvent(new CoreAnimatedPagesTransitionEndEvent(event));
            }
        });

    }

    public CoreAnimatedPagesElement getPolymerElement() {
        return (CoreAnimatedPagesElement) getElement();
    }
    

    public String getTransitions() {
        return getPolymerElement().transitions();
    }
    public void setTransitions(String value) {
        getElement().setAttribute("transitions", String.valueOf(value));
    }
    

    public Object getLastSelected() {
        return getPolymerElement().lastSelected();
    }
    public void setLastSelected(Object value) {
        getElement().setAttribute("lastSelected", String.valueOf(value));
    }
    public void setLastSelected(String lastSelected) {
        getElement().setAttribute("lastSelected", lastSelected);
    }




    public HandlerRegistration addCoreAnimatedPagesTransitionPrepareHandler(CoreAnimatedPagesTransitionPrepareEventHandler handler) {
        return addHandler(handler, CoreAnimatedPagesTransitionPrepareEvent.TYPE);
    }

    public HandlerRegistration addCoreAnimatedPagesTransitionEndHandler(CoreAnimatedPagesTransitionEndEventHandler handler) {
        return addHandler(handler, CoreAnimatedPagesTransitionEndEvent.TYPE);
    }

}
