package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperRadioGroup extends CoreSelector {

    public PaperRadioGroup(String html) {
        this("paper-radio-group", html);
    }
    
    public PaperRadioGroup(String tag, String html) {
        super(tag, html);

    }

    public PaperRadioGroupElement getPolymerElement() {
        return (PaperRadioGroupElement) getElement();
    }
    

    public String getSelectedAttribute() {
        return getPolymerElement().selectedAttribute();
    }
    public void setSelectedAttribute(String value) {
        getElement().setAttribute("selectedAttribute", String.valueOf(value));
    }
    

    public String getActivateEvent() {
        return getPolymerElement().activateEvent();
    }
    public void setActivateEvent(String value) {
        getElement().setAttribute("activateEvent", String.valueOf(value));
    }
    




}
