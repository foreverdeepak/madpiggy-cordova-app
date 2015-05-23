package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperInput extends PolymerWidget {

    public PaperInput(String html) {
        this("paper-input", html);
    }
    
    public PaperInput(String tag, String html) {
        super(tag, html);

    }

    public PaperInputElement getPolymerElement() {
        return (PaperInputElement) getElement();
    }
    

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    

    public boolean isFloatingLabel() {
        return getPolymerElement().floatingLabel();
    }
    public void setFloatingLabel(boolean value) {
        getElement().setAttribute("floatingLabel", String.valueOf(value));
    }
    public void setFloatingLabel(String floatingLabel) {
        setBooleanAttribute("floatingLabel", true);
    }

    public boolean isDisabled() {
        return getPolymerElement().disabled();
    }
    public void setDisabled(boolean value) {
        getElement().setAttribute("disabled", String.valueOf(value));
    }
    public void setDisabled(String disabled) {
        setBooleanAttribute("disabled", true);
    }

    public String getValue() {
        return getPolymerElement().value();
    }
    public void setValue(String value) {
        getElement().setAttribute("value", String.valueOf(value));
    }
    

    public String getCommittedValue() {
        return getPolymerElement().committedValue();
    }
    public void setCommittedValue(String value) {
        getElement().setAttribute("committedValue", String.valueOf(value));
    }
    



    public void focus() {
        getPolymerElement().focus();
    }


}
