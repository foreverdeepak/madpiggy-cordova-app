package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperRadioButton extends PolymerWidget {

    public PaperRadioButton(String html) {
        this("paper-radio-button", html);
    }
    
    public PaperRadioButton(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent event) {
                fireEvent(new ChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent event) {
                fireEvent(new CoreChangeEvent(event));
            }
        });

    }

    public PaperRadioButtonElement getPolymerElement() {
        return (PaperRadioButtonElement) getElement();
    }
    

    public boolean isChecked() {
        return getPolymerElement().checked();
    }
    public void setChecked(boolean value) {
        getElement().setAttribute("checked", String.valueOf(value));
    }
    public void setChecked(String checked) {
        setBooleanAttribute("checked", true);
    }

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    

    public boolean isToggles() {
        return getPolymerElement().toggles();
    }
    public void setToggles(boolean value) {
        getElement().setAttribute("toggles", String.valueOf(value));
    }
    public void setToggles(String toggles) {
        setBooleanAttribute("toggles", true);
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




    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, ChangeEvent.TYPE);
    }

    public HandlerRegistration addCoreChangeHandler(CoreChangeEventHandler handler) {
        return addHandler(handler, CoreChangeEvent.TYPE);
    }

}
