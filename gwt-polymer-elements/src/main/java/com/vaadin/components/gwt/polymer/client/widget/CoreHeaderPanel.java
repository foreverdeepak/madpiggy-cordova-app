package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreHeaderPanel extends PolymerWidget {

    public CoreHeaderPanel(String html) {
        this("core-header-panel", html);
    }
    
    public CoreHeaderPanel(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent event) {
                fireEvent(new ScrollEvent(event));
            }
        });

    }

    public CoreHeaderPanelElement getPolymerElement() {
        return (CoreHeaderPanelElement) getElement();
    }
    

    public String getMode() {
        return getPolymerElement().mode();
    }
    public void setMode(String value) {
        getElement().setAttribute("mode", String.valueOf(value));
    }
    

    public String getTallClass() {
        return getPolymerElement().tallClass();
    }
    public void setTallClass(String value) {
        getElement().setAttribute("tallClass", String.valueOf(value));
    }
    

    public boolean isShadow() {
        return getPolymerElement().shadow();
    }
    public void setShadow(boolean value) {
        getElement().setAttribute("shadow", String.valueOf(value));
    }
    public void setShadow(String shadow) {
        setBooleanAttribute("shadow", true);
    }


    public Object getScroller(){
        return getPolymerElement().scroller();
    }
    public void setScroller(Object value) {
        getPolymerElement().scroller(value);
    }



    public HandlerRegistration addScrollHandler(ScrollEventHandler handler) {
        return addHandler(handler, ScrollEvent.TYPE);
    }

}
