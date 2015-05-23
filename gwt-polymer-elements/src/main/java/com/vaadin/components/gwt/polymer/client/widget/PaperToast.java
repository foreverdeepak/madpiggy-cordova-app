package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperToast extends PolymerWidget {

    public PaperToast(String html) {
        this("paper-toast", html);
    }
    
    public PaperToast(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent event) {
                fireEvent(new CoreOverlayOpenEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent event) {
                fireEvent(new CoreOverlayOpenCompletedEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent event) {
                fireEvent(new CoreOverlayCloseCompletedEvent(event));
            }
        });

    }

    public PaperToastElement getPolymerElement() {
        return (PaperToastElement) getElement();
    }
    

    public String getText() {
        return getPolymerElement().text();
    }
    public void setText(String value) {
        getElement().setAttribute("text", String.valueOf(value));
    }
    

    public double getDuration() {
        return getPolymerElement().duration();
    }
    public void setDuration(double value) {
        getElement().setAttribute("duration", String.valueOf(value));
    }
    public void setDuration(String duration) {
        getElement().setAttribute("duration", duration);
    }

    public boolean isOpened() {
        return getPolymerElement().opened();
    }
    public void setOpened(boolean value) {
        getElement().setAttribute("opened", String.valueOf(value));
    }
    public void setOpened(String opened) {
        setBooleanAttribute("opened", true);
    }

    public String getResponsiveWidth() {
        return getPolymerElement().responsiveWidth();
    }
    public void setResponsiveWidth(String value) {
        getElement().setAttribute("responsiveWidth", String.valueOf(value));
    }
    

    public boolean isSwipeDisabled() {
        return getPolymerElement().swipeDisabled();
    }
    public void setSwipeDisabled(boolean value) {
        getElement().setAttribute("swipeDisabled", String.valueOf(value));
    }
    public void setSwipeDisabled(String swipeDisabled) {
        setBooleanAttribute("swipeDisabled", true);
    }

    public boolean isAutoCloseDisabled() {
        return getPolymerElement().autoCloseDisabled();
    }
    public void setAutoCloseDisabled(boolean value) {
        getElement().setAttribute("autoCloseDisabled", String.valueOf(value));
    }
    public void setAutoCloseDisabled(String autoCloseDisabled) {
        setBooleanAttribute("autoCloseDisabled", true);
    }



    public void toggle() {
        getPolymerElement().toggle();
    }

    public void show() {
        getPolymerElement().show();
    }

    public void dismiss() {
        getPolymerElement().dismiss();
    }


    public HandlerRegistration addCoreOverlayOpenHandler(CoreOverlayOpenEventHandler handler) {
        return addHandler(handler, CoreOverlayOpenEvent.TYPE);
    }

    public HandlerRegistration addCoreOverlayOpenCompletedHandler(CoreOverlayOpenCompletedEventHandler handler) {
        return addHandler(handler, CoreOverlayOpenCompletedEvent.TYPE);
    }

    public HandlerRegistration addCoreOverlayCloseCompletedHandler(CoreOverlayCloseCompletedEventHandler handler) {
        return addHandler(handler, CoreOverlayCloseCompletedEvent.TYPE);
    }

}
