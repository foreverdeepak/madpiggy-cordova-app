package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreA11yKeys extends PolymerWidget {

    public CoreA11yKeys(String html) {
        this("core-a11y-keys", html);
    }
    
    public CoreA11yKeys(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent event) {
                fireEvent(new KeysPressedEvent(event));
            }
        });

    }

    public CoreA11yKeysElement getPolymerElement() {
        return (CoreA11yKeysElement) getElement();
    }
    

    public String getKeys() {
        return getPolymerElement().keys();
    }
    public void setKeys(String value) {
        getElement().setAttribute("keys", String.valueOf(value));
    }
    

    public Object getTarget() {
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getElement().setAttribute("target", String.valueOf(value));
    }
    public void setTarget(String target) {
        getElement().setAttribute("target", target);
    }




    public HandlerRegistration addKeysPressedHandler(KeysPressedEventHandler handler) {
        return addHandler(handler, KeysPressedEvent.TYPE);
    }

}
