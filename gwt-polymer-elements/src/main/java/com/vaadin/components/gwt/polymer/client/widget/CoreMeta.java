package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreMeta extends PolymerWidget {

    public CoreMeta(String html) {
        this("core-meta", html);
    }
    
    public CoreMeta(String tag, String html) {
        super(tag, html);

    }

    public CoreMetaElement getPolymerElement() {
        return (CoreMetaElement) getElement();
    }
    

    public String getType() {
        return getPolymerElement().type();
    }
    public void setType(String value) {
        getElement().setAttribute("type", String.valueOf(value));
    }
    


    public JsArray getList(){
        return getPolymerElement().list();
    }
    public void setList(JsArray value) {
        getPolymerElement().list(value);
    }


    public void byId(String id) {
        getPolymerElement().byId(id);
    }


}
