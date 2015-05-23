package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreScrollHeaderPanel extends PolymerWidget {

    public CoreScrollHeaderPanel(String html) {
        this("core-scroll-header-panel", html);
    }
    
    public CoreScrollHeaderPanel(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent event) {
                fireEvent(new ScrollEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent event) {
                fireEvent(new CoreHeaderTransformEvent(event));
            }
        });

    }

    public CoreScrollHeaderPanelElement getPolymerElement() {
        return (CoreScrollHeaderPanelElement) getElement();
    }
    

    public boolean isCondenses() {
        return getPolymerElement().condenses();
    }
    public void setCondenses(boolean value) {
        getElement().setAttribute("condenses", String.valueOf(value));
    }
    public void setCondenses(String condenses) {
        setBooleanAttribute("condenses", true);
    }

    public boolean isNoDissolve() {
        return getPolymerElement().noDissolve();
    }
    public void setNoDissolve(boolean value) {
        getElement().setAttribute("noDissolve", String.valueOf(value));
    }
    public void setNoDissolve(String noDissolve) {
        setBooleanAttribute("noDissolve", true);
    }

    public boolean isNoReveal() {
        return getPolymerElement().noReveal();
    }
    public void setNoReveal(boolean value) {
        getElement().setAttribute("noReveal", String.valueOf(value));
    }
    public void setNoReveal(String noReveal) {
        setBooleanAttribute("noReveal", true);
    }

    public boolean isFixed() {
        return getPolymerElement().fixed();
    }
    public void setFixed(boolean value) {
        getElement().setAttribute("fixed", String.valueOf(value));
    }
    public void setFixed(String fixed) {
        setBooleanAttribute("fixed", true);
    }

    public boolean isKeepCondensedHeader() {
        return getPolymerElement().keepCondensedHeader();
    }
    public void setKeepCondensedHeader(boolean value) {
        getElement().setAttribute("keepCondensedHeader", String.valueOf(value));
    }
    public void setKeepCondensedHeader(String keepCondensedHeader) {
        setBooleanAttribute("keepCondensedHeader", true);
    }

    public double getHeaderHeight() {
        return getPolymerElement().headerHeight();
    }
    public void setHeaderHeight(double value) {
        getElement().setAttribute("headerHeight", String.valueOf(value));
    }
    public void setHeaderHeight(String headerHeight) {
        getElement().setAttribute("headerHeight", headerHeight);
    }

    public double getCondensedHeaderHeight() {
        return getPolymerElement().condensedHeaderHeight();
    }
    public void setCondensedHeaderHeight(double value) {
        getElement().setAttribute("condensedHeaderHeight", String.valueOf(value));
    }
    public void setCondensedHeaderHeight(String condensedHeaderHeight) {
        getElement().setAttribute("condensedHeaderHeight", condensedHeaderHeight);
    }

    public boolean isScrollAwayTopbar() {
        return getPolymerElement().scrollAwayTopbar();
    }
    public void setScrollAwayTopbar(boolean value) {
        getElement().setAttribute("scrollAwayTopbar", String.valueOf(value));
    }
    public void setScrollAwayTopbar(String scrollAwayTopbar) {
        setBooleanAttribute("scrollAwayTopbar", true);
    }


    public Object getScroller(){
        return getPolymerElement().scroller();
    }
    public void setScroller(Object value) {
        getPolymerElement().scroller(value);
    }


    public void measureHeaderHeight() {
        getPolymerElement().measureHeaderHeight();
    }


    public HandlerRegistration addScrollHandler(ScrollEventHandler handler) {
        return addHandler(handler, ScrollEvent.TYPE);
    }

    public HandlerRegistration addCoreHeaderTransformHandler(CoreHeaderTransformEventHandler handler) {
        return addHandler(handler, CoreHeaderTransformEvent.TYPE);
    }

}
