package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperProgress extends CoreRange {

    public PaperProgress(String html) {
        this("paper-progress", html);
    }
    
    public PaperProgress(String tag, String html) {
        super(tag, html);

    }

    public PaperProgressElement getPolymerElement() {
        return (PaperProgressElement) getElement();
    }
    

    public double getSecondaryProgress() {
        return getPolymerElement().secondaryProgress();
    }
    public void setSecondaryProgress(double value) {
        getElement().setAttribute("secondaryProgress", String.valueOf(value));
    }
    public void setSecondaryProgress(String secondaryProgress) {
        getElement().setAttribute("secondaryProgress", secondaryProgress);
    }

    public boolean isIndeterminate() {
        return getPolymerElement().indeterminate();
    }
    public void setIndeterminate(boolean value) {
        getElement().setAttribute("indeterminate", String.valueOf(value));
    }
    public void setIndeterminate(String indeterminate) {
        setBooleanAttribute("indeterminate", true);
    }




}
