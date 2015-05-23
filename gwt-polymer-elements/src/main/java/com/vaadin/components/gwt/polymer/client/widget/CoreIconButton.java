package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreIconButton extends PolymerWidget {

    public CoreIconButton(String html) {
        this("core-icon-button", html);
    }
    
    public CoreIconButton(String tag, String html) {
        super(tag, html);

    }

    public CoreIconButtonElement getPolymerElement() {
        return (CoreIconButtonElement) getElement();
    }
    

    public String getSrc() {
        return getPolymerElement().src();
    }
    public void setSrc(String value) {
        getElement().setAttribute("src", String.valueOf(value));
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

    public String getIcon() {
        return getPolymerElement().icon();
    }
    public void setIcon(String value) {
        getElement().setAttribute("icon", String.valueOf(value));
    }
    




}
