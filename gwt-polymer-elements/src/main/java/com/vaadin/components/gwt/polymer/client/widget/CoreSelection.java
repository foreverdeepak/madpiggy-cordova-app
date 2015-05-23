package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreSelection extends PolymerWidget {

    public CoreSelection(String html) {
        this("core-selection", html);
    }
    
    public CoreSelection(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent event) {
                fireEvent(new CoreSelectEvent(event));
            }
        });

    }

    public CoreSelectionElement getPolymerElement() {
        return (CoreSelectionElement) getElement();
    }
    

    public boolean isMulti() {
        return getPolymerElement().multi();
    }
    public void setMulti(boolean value) {
        getElement().setAttribute("multi", String.valueOf(value));
    }
    public void setMulti(String multi) {
        setBooleanAttribute("multi", true);
    }



    public void getSelection() {
        getPolymerElement().getSelection();
    }

    public void isSelected(Object item) {
        getPolymerElement().isSelected(item);
    }

    public void select() {
        getPolymerElement().select();
    }

    public void toggle() {
        getPolymerElement().toggle();
    }


    public HandlerRegistration addCoreSelectHandler(CoreSelectEventHandler handler) {
        return addHandler(handler, CoreSelectEvent.TYPE);
    }

}
