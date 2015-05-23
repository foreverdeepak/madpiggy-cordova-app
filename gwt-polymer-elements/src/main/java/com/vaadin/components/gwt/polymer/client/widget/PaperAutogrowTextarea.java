package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperAutogrowTextarea extends PolymerWidget {

    public PaperAutogrowTextarea(String html) {
        this("paper-autogrow-textarea", html);
    }
    
    public PaperAutogrowTextarea(String tag, String html) {
        super(tag, html);

    }

    public PaperAutogrowTextareaElement getPolymerElement() {
        return (PaperAutogrowTextareaElement) getElement();
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

    public double getRows() {
        return getPolymerElement().rows();
    }
    public void setRows(double value) {
        getElement().setAttribute("rows", String.valueOf(value));
    }
    public void setRows(String rows) {
        getElement().setAttribute("rows", rows);
    }

    public double getMaxRows() {
        return getPolymerElement().maxRows();
    }
    public void setMaxRows(double value) {
        getElement().setAttribute("maxRows", String.valueOf(value));
    }
    public void setMaxRows(String maxRows) {
        getElement().setAttribute("maxRows", maxRows);
    }



    public void update() {
        getPolymerElement().update();
    }


}
