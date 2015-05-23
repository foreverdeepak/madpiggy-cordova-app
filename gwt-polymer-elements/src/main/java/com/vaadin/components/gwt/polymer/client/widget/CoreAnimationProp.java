package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreAnimationProp extends PolymerWidget {

    public CoreAnimationProp(String html) {
        this("core-animation-prop", html);
    }
    
    public CoreAnimationProp(String tag, String html) {
        super(tag, html);

    }

    public CoreAnimationPropElement getPolymerElement() {
        return (CoreAnimationPropElement) getElement();
    }
    


    public String getName(){
        return getPolymerElement().name();
    }
    public void setName(String value) {
        getPolymerElement().name(value);
    }

    public Object getValue(){
        return getPolymerElement().value();
    }
    public void setValue(Object value) {
        getPolymerElement().value(value);
    }



}
