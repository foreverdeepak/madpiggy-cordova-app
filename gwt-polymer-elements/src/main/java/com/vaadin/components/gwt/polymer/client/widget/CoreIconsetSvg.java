package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreIconsetSvg extends CoreMeta {

    public CoreIconsetSvg(String html) {
        this("core-iconset-svg", html);
    }
    
    public CoreIconsetSvg(String tag, String html) {
        super(tag, html);

    }

    public CoreIconsetSvgElement getPolymerElement() {
        return (CoreIconsetSvgElement) getElement();
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



    public void applyIcon(Element element, Object icon) {
        getPolymerElement().applyIcon(element, icon);
    }

    public void updateIcons(String css, String method) {
        getPolymerElement().updateIcons(css, method);
    }


}
