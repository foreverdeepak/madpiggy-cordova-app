package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreOverlay extends PolymerWidget {

    public CoreOverlay(String html) {
        this("core-overlay", html);
    }
    
    public CoreOverlay(String tag, String html) {
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

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent event) {
                fireEvent(new CoreOverlayPositionEvent(event));
            }
        });

    }

    public CoreOverlayElement getPolymerElement() {
        return (CoreOverlayElement) getElement();
    }
    

    public Object getTarget() {
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getElement().setAttribute("target", String.valueOf(value));
    }
    public void setTarget(String target) {
        getElement().setAttribute("target", target);
    }

    public Object getSizingTarget() {
        return getPolymerElement().sizingTarget();
    }
    public void setSizingTarget(Object value) {
        getElement().setAttribute("sizingTarget", String.valueOf(value));
    }
    public void setSizingTarget(String sizingTarget) {
        getElement().setAttribute("sizingTarget", sizingTarget);
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

    public boolean isBackdrop() {
        return getPolymerElement().backdrop();
    }
    public void setBackdrop(boolean value) {
        getElement().setAttribute("backdrop", String.valueOf(value));
    }
    public void setBackdrop(String backdrop) {
        setBooleanAttribute("backdrop", true);
    }

    public boolean isLayered() {
        return getPolymerElement().layered();
    }
    public void setLayered(boolean value) {
        getElement().setAttribute("layered", String.valueOf(value));
    }
    public void setLayered(String layered) {
        setBooleanAttribute("layered", true);
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

    public boolean isAutoFocusDisabled() {
        return getPolymerElement().autoFocusDisabled();
    }
    public void setAutoFocusDisabled(boolean value) {
        getElement().setAttribute("autoFocusDisabled", String.valueOf(value));
    }
    public void setAutoFocusDisabled(String autoFocusDisabled) {
        setBooleanAttribute("autoFocusDisabled", true);
    }

    public String getCloseAttribute() {
        return getPolymerElement().closeAttribute();
    }
    public void setCloseAttribute(String value) {
        getElement().setAttribute("closeAttribute", String.valueOf(value));
    }
    

    public String getCloseSelector() {
        return getPolymerElement().closeSelector();
    }
    public void setCloseSelector(String value) {
        getElement().setAttribute("closeSelector", String.valueOf(value));
    }
    

    public String getTransition() {
        return getPolymerElement().transition();
    }
    public void setTransition(String value) {
        getElement().setAttribute("transition", String.valueOf(value));
    }
    



    public void toggle() {
        getPolymerElement().toggle();
    }

    public void open() {
        getPolymerElement().open();
    }

    public void close() {
        getPolymerElement().close();
    }

    public void resizeHandler() {
        getPolymerElement().resizeHandler();
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

    public HandlerRegistration addCoreOverlayPositionHandler(CoreOverlayPositionEventHandler handler) {
        return addHandler(handler, CoreOverlayPositionEvent.TYPE);
    }

}
