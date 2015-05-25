package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class ViewPager extends PolymerWidget {

    public ViewPager(String html) {
        this("view-pager", html);
    }
    
    public ViewPager(String tag, String html) {
        super(tag, html);

    }

    public ViewPagerElement getPolymerElement() {
        return (ViewPagerElement) getElement();
    }
    

    public Object getTabAttributes() {
        return getPolymerElement().tabAttributes();
    }
    public void setTabAttributes(Object value) {
        getElement().setAttribute("tabAttributes", String.valueOf(value));
    }
    public void setTabAttributes(String tabAttributes) {
        getElement().setAttribute("tabAttributes", tabAttributes);
    }

    public Object getSelected() {
        return getPolymerElement().selected();
    }
    public void setSelected(Object value) {
        getElement().setAttribute("selected", String.valueOf(value));
    }
    public void setSelected(String selected) {
        getElement().setAttribute("selected", selected);
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




}
