package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperRipple extends PolymerWidget {

    public PaperRipple(String html) {
        this("paper-ripple", html);
    }
    
    public PaperRipple(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent event) {
                fireEvent(new CoreTransitionendEvent(event));
            }
        });

    }

    public PaperRippleElement getPolymerElement() {
        return (PaperRippleElement) getElement();
    }
    

    public double getInitialOpacity() {
        return getPolymerElement().initialOpacity();
    }
    public void setInitialOpacity(double value) {
        getElement().setAttribute("initialOpacity", String.valueOf(value));
    }
    public void setInitialOpacity(String initialOpacity) {
        getElement().setAttribute("initialOpacity", initialOpacity);
    }

    public double getOpacityDecayVelocity() {
        return getPolymerElement().opacityDecayVelocity();
    }
    public void setOpacityDecayVelocity(double value) {
        getElement().setAttribute("opacityDecayVelocity", String.valueOf(value));
    }
    public void setOpacityDecayVelocity(String opacityDecayVelocity) {
        getElement().setAttribute("opacityDecayVelocity", opacityDecayVelocity);
    }




    public HandlerRegistration addCoreTransitionendHandler(CoreTransitionendEventHandler handler) {
        return addHandler(handler, CoreTransitionendEvent.TYPE);
    }

}
