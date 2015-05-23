package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreCollapse extends PolymerWidget {

    public CoreCollapse(String html) {
        this("core-collapse", html);
    }
    
    public CoreCollapse(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent event) {
                fireEvent(new CoreCollapseOpenEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent event) {
                fireEvent(new CoreResizeEvent(event));
            }
        });

    }

    public CoreCollapseElement getPolymerElement() {
        return (CoreCollapseElement) getElement();
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

    public boolean isHorizontal() {
        return getPolymerElement().horizontal();
    }
    public void setHorizontal(boolean value) {
        getElement().setAttribute("horizontal", String.valueOf(value));
    }
    public void setHorizontal(String horizontal) {
        setBooleanAttribute("horizontal", true);
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

    public double getDuration() {
        return getPolymerElement().duration();
    }
    public void setDuration(double value) {
        getElement().setAttribute("duration", String.valueOf(value));
    }
    public void setDuration(String duration) {
        getElement().setAttribute("duration", duration);
    }

    public boolean isFixedSize() {
        return getPolymerElement().fixedSize();
    }
    public void setFixedSize(boolean value) {
        getElement().setAttribute("fixedSize", String.valueOf(value));
    }
    public void setFixedSize(String fixedSize) {
        setBooleanAttribute("fixedSize", true);
    }

    public boolean isAllowOverflow() {
        return getPolymerElement().allowOverflow();
    }
    public void setAllowOverflow(boolean value) {
        getElement().setAttribute("allowOverflow", String.valueOf(value));
    }
    public void setAllowOverflow(String allowOverflow) {
        setBooleanAttribute("allowOverflow", true);
    }



    public void toggle() {
        getPolymerElement().toggle();
    }


    public HandlerRegistration addCoreCollapseOpenHandler(CoreCollapseOpenEventHandler handler) {
        return addHandler(handler, CoreCollapseOpenEvent.TYPE);
    }

    public HandlerRegistration addCoreResizeHandler(CoreResizeEventHandler handler) {
        return addHandler(handler, CoreResizeEvent.TYPE);
    }

}
