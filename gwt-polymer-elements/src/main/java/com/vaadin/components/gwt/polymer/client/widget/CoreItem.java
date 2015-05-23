package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreItem extends PolymerWidget {

    public CoreItem(String html) {
        this("core-item", html);
    }
    
    public CoreItem(String tag, String html) {
        super(tag, html);

    }

    public CoreItemElement getPolymerElement() {
        return (CoreItemElement) getElement();
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
    

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    




}
