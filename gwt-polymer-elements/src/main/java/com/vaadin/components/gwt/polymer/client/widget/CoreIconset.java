package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreIconset extends CoreMeta {

    public CoreIconset(String html) {
        this("core-iconset", html);
    }
    
    public CoreIconset(String tag, String html) {
        super(tag, html);

    }

    public CoreIconsetElement getPolymerElement() {
        return (CoreIconsetElement) getElement();
    }
    

    public String getSrc() {
        return getPolymerElement().src();
    }
    public void setSrc(String value) {
        getElement().setAttribute("src", String.valueOf(value));
    }
    

    public double getWidth() {
        return getPolymerElement().width();
    }
    public void setWidth(double value) {
        getElement().setAttribute("width", String.valueOf(value));
    }
    public void setWidth(String width) {
        getElement().setAttribute("width", width);
    }

    public String getIcons() {
        return getPolymerElement().icons();
    }
    public void setIcons(String value) {
        getElement().setAttribute("icons", String.valueOf(value));
    }
    

    public double getIconSize() {
        return getPolymerElement().iconSize();
    }
    public void setIconSize(double value) {
        getElement().setAttribute("iconSize", String.valueOf(value));
    }
    public void setIconSize(String iconSize) {
        getElement().setAttribute("iconSize", iconSize);
    }

    public double getOffsetX() {
        return getPolymerElement().offsetX();
    }
    public void setOffsetX(double value) {
        getElement().setAttribute("offsetX", String.valueOf(value));
    }
    public void setOffsetX(String offsetX) {
        getElement().setAttribute("offsetX", offsetX);
    }

    public double getOffsetY() {
        return getPolymerElement().offsetY();
    }
    public void setOffsetY(double value) {
        getElement().setAttribute("offsetY", String.valueOf(value));
    }
    public void setOffsetY(String offsetY) {
        getElement().setAttribute("offsetY", offsetY);
    }



    public void getOffset(Object icon, String theme) {
        getPolymerElement().getOffset(icon, theme);
    }

    public void applyIcon(Element element, Object icon, double scale) {
        getPolymerElement().applyIcon(element, icon, scale);
    }


}
