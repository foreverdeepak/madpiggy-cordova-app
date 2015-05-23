package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreLabel extends PolymerWidget {

    public CoreLabel(String html) {
        this("core-label", html);
    }
    
    public CoreLabel(String tag, String html) {
        super(tag, html);

    }

    public CoreLabelElement getPolymerElement() {
        return (CoreLabelElement) getElement();
    }
    

    public String getFor() {
        return getPolymerElement().getFor();
    }
    public void setFor(String value) {
        getElement().setAttribute("for", String.valueOf(value));
    }
    




}
