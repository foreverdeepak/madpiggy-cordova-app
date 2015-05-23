package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class Coreresizer extends Coreresizable {

    public Coreresizer(String html) {
        this("CoreResizer", html);
    }
    
    public Coreresizer(String tag, String html) {
        super(tag, html);

    }

    public CoreresizerElement getPolymerElement() {
        return (CoreresizerElement) getElement();
    }
    


    public Object getResizerIsPeer(){
        return getPolymerElement().resizerIsPeer();
    }
    public void setResizerIsPeer(Object value) {
        getPolymerElement().resizerIsPeer(value);
    }


    public void resizerAttachedHandler() {
        getPolymerElement().resizerAttachedHandler();
    }

    public void resizerDetachedHandler() {
        getPolymerElement().resizerDetachedHandler();
    }

    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    public void resizeerShouldNotify() {
        getPolymerElement().resizeerShouldNotify();
    }


}
