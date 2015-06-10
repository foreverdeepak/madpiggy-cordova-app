package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreIcon extends PolymerWidget {

    public CoreIcon(String html) {
        this("core-icon", html);
    }
    
    public CoreIcon(String tag, String html) {
        super(tag, html);

    }

    public IronIconElement getPolymerElement() {
        return (IronIconElement) getElement();
    }
    

    public String getSrc() {
        return getPolymerElement().src();
    }
    public void setSrc(String value) {
        getElement().setAttribute("src", String.valueOf(value));
    }
    

    public String getIcon() {
        return getPolymerElement().icon();
    }
    public void setIcon(String value) {
        getElement().setAttribute("icon", String.valueOf(value));
    }
    

    public String getAlt() {
        return getPolymerElement().alt();
    }
    public void setAlt(String value) {
        getElement().setAttribute("alt", String.valueOf(value));
    }
    




}
