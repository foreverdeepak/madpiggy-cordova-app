package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperShadow extends PolymerWidget {

    public PaperShadow(String html) {
        this("paper-shadow", html);
    }
    
    public PaperShadow(String tag, String html) {
        super(tag, html);

    }

    public PaperShadowElement getPolymerElement() {
        return (PaperShadowElement) getElement();
    }
    

    public double getZ() {
        return getPolymerElement().z();
    }
    public void setZ(double value) {
        getElement().setAttribute("z", String.valueOf(value));
    }
    public void setZ(String z) {
        getElement().setAttribute("z", z);
    }

    public boolean isAnimated() {
        return getPolymerElement().animated();
    }
    public void setAnimated(boolean value) {
        getElement().setAttribute("animated", String.valueOf(value));
    }
    public void setAnimated(String animated) {
        setBooleanAttribute("animated", true);
    }



    public void setZ() {
        getPolymerElement().setZ();
    }


}
