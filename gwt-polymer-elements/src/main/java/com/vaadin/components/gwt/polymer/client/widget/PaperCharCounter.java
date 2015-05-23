package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperCharCounter extends PolymerWidget {

    public PaperCharCounter(String html) {
        this("paper-char-counter", html);
    }
    
    public PaperCharCounter(String tag, String html) {
        super(tag, html);

    }

    public PaperCharCounterElement getPolymerElement() {
        return (PaperCharCounterElement) getElement();
    }
    

    public String getTarget() {
        return getPolymerElement().target();
    }
    public void setTarget(String value) {
        getElement().setAttribute("target", String.valueOf(value));
    }
    

    public boolean isShowCounter() {
        return getPolymerElement().showCounter();
    }
    public void setShowCounter(boolean value) {
        getElement().setAttribute("showCounter", String.valueOf(value));
    }
    public void setShowCounter(String showCounter) {
        setBooleanAttribute("showCounter", true);
    }




}
