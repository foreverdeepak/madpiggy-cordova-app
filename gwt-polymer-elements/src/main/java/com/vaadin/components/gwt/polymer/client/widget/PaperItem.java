package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperItem extends PaperButtonBase {

    public PaperItem(String html) {
        this("paper-item", html);
    }
    
    public PaperItem(String tag, String html) {
        super(tag, html);

    }

    public PaperItemElement getPolymerElement() {
        return (PaperItemElement) getElement();
    }
    

    public boolean isRaised() {
        return getPolymerElement().raised();
    }
    public void setRaised(boolean value) {
        getElement().setAttribute("raised", String.valueOf(value));
    }
    public void setRaised(String raised) {
        setBooleanAttribute("raised", true);
    }

    public boolean isRecenteringTouch() {
        return getPolymerElement().recenteringTouch();
    }
    public void setRecenteringTouch(boolean value) {
        getElement().setAttribute("recenteringTouch", String.valueOf(value));
    }
    public void setRecenteringTouch(String recenteringTouch) {
        setBooleanAttribute("recenteringTouch", true);
    }

    public boolean isFill() {
        return getPolymerElement().fill();
    }
    public void setFill(boolean value) {
        getElement().setAttribute("fill", String.valueOf(value));
    }
    public void setFill(String fill) {
        setBooleanAttribute("fill", true);
    }




}
