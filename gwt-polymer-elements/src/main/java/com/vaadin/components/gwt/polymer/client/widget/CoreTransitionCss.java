package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreTransitionCss extends CoreTransition {

    public CoreTransitionCss(String html) {
        this("core-transition-css", html);
    }
    
    public CoreTransitionCss(String tag, String html) {
        super(tag, html);

    }

    public CoreTransitionCssElement getPolymerElement() {
        return (CoreTransitionCssElement) getElement();
    }
    

    public String getBaseClass() {
        return getPolymerElement().baseClass();
    }
    public void setBaseClass(String value) {
        getElement().setAttribute("baseClass", String.valueOf(value));
    }
    

    public String getOpenedClass() {
        return getPolymerElement().openedClass();
    }
    public void setOpenedClass(String value) {
        getElement().setAttribute("openedClass", String.valueOf(value));
    }
    

    public String getClosedClass() {
        return getPolymerElement().closedClass();
    }
    public void setClosedClass(String value) {
        getElement().setAttribute("closedClass", String.valueOf(value));
    }
    

    public String getCompleteEventName() {
        return getPolymerElement().completeEventName();
    }
    public void setCompleteEventName(String value) {
        getElement().setAttribute("completeEventName", String.valueOf(value));
    }
    

    public String getTransitionType() {
        return getPolymerElement().transitionType();
    }
    public void setTransitionType(String value) {
        getElement().setAttribute("transitionType", String.valueOf(value));
    }
    




}
