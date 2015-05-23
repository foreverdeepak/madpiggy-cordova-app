package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperCheckbox extends PaperRadioButton {

    public PaperCheckbox(String html) {
        this("paper-checkbox", html);
    }
    
    public PaperCheckbox(String tag, String html) {
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

    public PaperCheckboxElement getPolymerElement() {
        return (PaperCheckboxElement) getElement();
    }
    




    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, ChangeEvent.TYPE);
    }

    public HandlerRegistration addCoreChangeHandler(CoreChangeEventHandler handler) {
        return addHandler(handler, CoreChangeEvent.TYPE);
    }

}
