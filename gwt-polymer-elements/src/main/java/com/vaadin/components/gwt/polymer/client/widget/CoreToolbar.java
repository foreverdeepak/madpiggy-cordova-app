package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreToolbar extends PolymerWidget {

    public CoreToolbar(String html) {
        this("core-toolbar", html);
    }
    
    public CoreToolbar(String tag, String html) {
        super(tag, html);

    }

    public CoreToolbarElement getPolymerElement() {
        return (CoreToolbarElement) getElement();
    }
    

    public String getJustify() {
        return getPolymerElement().justify();
    }
    public void setJustify(String value) {
        getElement().setAttribute("justify", String.valueOf(value));
    }
    

    public String getMiddleJustify() {
        return getPolymerElement().middleJustify();
    }
    public void setMiddleJustify(String value) {
        getElement().setAttribute("middleJustify", String.valueOf(value));
    }
    

    public String getBottomJustify() {
        return getPolymerElement().bottomJustify();
    }
    public void setBottomJustify(String value) {
        getElement().setAttribute("bottomJustify", String.valueOf(value));
    }
    




}
