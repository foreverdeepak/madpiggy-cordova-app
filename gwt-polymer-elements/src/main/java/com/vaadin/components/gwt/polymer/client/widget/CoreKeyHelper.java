package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreKeyHelper extends PolymerWidget {

    public CoreKeyHelper(String html) {
        this("core-key-helper", html);
    }
    
    public CoreKeyHelper(String tag, String html) {
        super(tag, html);

    }

    public CoreKeyHelperElement getPolymerElement() {
        return (CoreKeyHelperElement) getElement();
    }
    




}
