package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreDropdown extends CoreOverlay {

    public CoreDropdown(String html) {
        this("core-dropdown", html);
    }
    
    public CoreDropdown(String tag, String html) {
        super(tag, html);

    }

    public CoreDropdownElement getPolymerElement() {
        return (CoreDropdownElement) getElement();
    }
    

    public Object getRelatedTarget() {
        return getPolymerElement().relatedTarget();
    }
    public void setRelatedTarget(Object value) {
        getElement().setAttribute("relatedTarget", String.valueOf(value));
    }
    public void setRelatedTarget(String relatedTarget) {
        getElement().setAttribute("relatedTarget", relatedTarget);
    }

    public String getHalign() {
        return getPolymerElement().halign();
    }
    public void setHalign(String value) {
        getElement().setAttribute("halign", String.valueOf(value));
    }
    

    public String getValign() {
        return getPolymerElement().valign();
    }
    public void setValign(String value) {
        getElement().setAttribute("valign", String.valueOf(value));
    }
    




}
