package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class Coreresizable extends PolymerWidget {

    public Coreresizable(String html) {
        this("CoreResizable", html);
    }
    
    public Coreresizable(String tag, String html) {
        super(tag, html);

    }

    public CoreresizableElement getPolymerElement() {
        return (CoreresizableElement) getElement();
    }
    



    public void resizableAttachedHandler() {
        getPolymerElement().resizableAttachedHandler();
    }

    public void resizableDetachedHandler() {
        getPolymerElement().resizableDetachedHandler();
    }


}
