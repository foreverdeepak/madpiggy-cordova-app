package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreInput extends Input {

    public CoreInput(String html) {
        this("core-input", html);
    }
    
    public CoreInput(String tag, String html) {
        super(tag, html);

    }

    public CoreInputElement getPolymerElement() {
        return (CoreInputElement) getElement();
    }
    

    public String getCommittedValue() {
        return getPolymerElement().committedValue();
    }
    public void setCommittedValue(String value) {
        getElement().setAttribute("committedValue", String.valueOf(value));
    }
    

    public boolean isPreventInvalidInput() {
        return getPolymerElement().preventInvalidInput();
    }
    public void setPreventInvalidInput(boolean value) {
        getElement().setAttribute("preventInvalidInput", String.valueOf(value));
    }
    public void setPreventInvalidInput(String preventInvalidInput) {
        setBooleanAttribute("preventInvalidInput", true);
    }



    public void commit() {
        getPolymerElement().commit();
    }


}
