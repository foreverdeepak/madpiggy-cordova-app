package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperDialogBase extends CoreOverlay {

    public PaperDialogBase(String html) {
        this("paper-dialog-base", html);
    }
    
    public PaperDialogBase(String tag, String html) {
        super(tag, html);

    }

    public PaperDialogBaseElement getPolymerElement() {
        return (PaperDialogBaseElement) getElement();
    }
    

    public String getHeading() {
        return getPolymerElement().heading();
    }
    public void setHeading(String value) {
        getElement().setAttribute("heading", String.valueOf(value));
    }
    

    public String getTransition() {
        return getPolymerElement().transition();
    }
    public void setTransition(String value) {
        getElement().setAttribute("transition", String.valueOf(value));
    }
    

    public boolean isLayered() {
        return getPolymerElement().layered();
    }
    public void setLayered(boolean value) {
        getElement().setAttribute("layered", String.valueOf(value));
    }
    public void setLayered(String layered) {
        setBooleanAttribute("layered", true);
    }




}
