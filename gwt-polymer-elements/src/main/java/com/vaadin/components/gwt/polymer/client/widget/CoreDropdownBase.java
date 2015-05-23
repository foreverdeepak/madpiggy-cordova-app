package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreDropdownBase extends PolymerWidget {

    public CoreDropdownBase(String html) {
        this("core-dropdown-base", html);
    }
    
    public CoreDropdownBase(String tag, String html) {
        super(tag, html);

    }

    public CoreDropdownBaseElement getPolymerElement() {
        return (CoreDropdownBaseElement) getElement();
    }
    

    public boolean isOpened() {
        return getPolymerElement().opened();
    }
    public void setOpened(boolean value) {
        getElement().setAttribute("opened", String.valueOf(value));
    }
    public void setOpened(String opened) {
        setBooleanAttribute("opened", true);
    }




}
