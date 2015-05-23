package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperDropdownTransition extends CoreTransitionCss {

    public PaperDropdownTransition(String html) {
        this("paper-dropdown-transition", html);
    }
    
    public PaperDropdownTransition(String tag, String html) {
        super(tag, html);

    }

    public PaperDropdownTransitionElement getPolymerElement() {
        return (PaperDropdownTransitionElement) getElement();
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




}
