package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperSpinner extends PolymerWidget {

    public PaperSpinner(String html) {
        this("paper-spinner", html);
    }
    
    public PaperSpinner(String tag, String html) {
        super(tag, html);

    }

    public PaperSpinnerElement getPolymerElement() {
        return (PaperSpinnerElement) getElement();
    }
    

    public boolean isActive() {
        return getPolymerElement().active();
    }
    public void setActive(boolean value) {
        getElement().setAttribute("active", String.valueOf(value));
    }
    public void setActive(String active) {
        setBooleanAttribute("active", true);
    }

    public String getAlt() {
        return getPolymerElement().alt();
    }
    public void setAlt(String value) {
        getElement().setAttribute("alt", String.valueOf(value));
    }
    




}
