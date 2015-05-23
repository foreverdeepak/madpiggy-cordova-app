package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreStyle extends PolymerWidget {

    public CoreStyle(String html) {
        this("core-style", html);
    }
    
    public CoreStyle(String tag, String html) {
        super(tag, html);

    }

    public CoreStyleElement getPolymerElement() {
        return (CoreStyleElement) getElement();
    }
    

    public String getId() {
        return getPolymerElement().id();
    }
    public void setId(String value) {
        getElement().setAttribute("id", String.valueOf(value));
    }
    

    public String getRef() {
        return getPolymerElement().ref();
    }
    public void setRef(String value) {
        getElement().setAttribute("ref", String.valueOf(value));
    }
    

    public Object getList() {
        return getPolymerElement().list();
    }
    public void setList(Object value) {
        getElement().setAttribute("list", String.valueOf(value));
    }
    public void setList(String list) {
        getElement().setAttribute("list", list);
    }




}
