package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreAnimationGroup extends PolymerWidget {

    public CoreAnimationGroup(String html) {
        this("core-animation-group", html);
    }
    
    public CoreAnimationGroup(String tag, String html) {
        super(tag, html);

    }

    public CoreAnimationGroupElement getPolymerElement() {
        return (CoreAnimationGroupElement) getElement();
    }
    


    public Object getTarget(){
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getPolymerElement().target(value);
    }

    public double getDuration(){
        return getPolymerElement().duration();
    }
    public void setDuration(double value) {
        getPolymerElement().duration(value);
    }

    public String getType(){
        return getPolymerElement().type();
    }
    public void setType(String value) {
        getPolymerElement().type(value);
    }



}
