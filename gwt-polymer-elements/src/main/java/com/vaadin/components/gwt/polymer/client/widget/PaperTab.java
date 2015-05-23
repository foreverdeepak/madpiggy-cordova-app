package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperTab extends PolymerWidget {

    public PaperTab(String html) {
        this("paper-tab", html);
    }
    
    public PaperTab(String tag, String html) {
        super(tag, html);

    }

    public PaperTabElement getPolymerElement() {
        return (PaperTabElement) getElement();
    }
    

    public boolean isNoink() {
        return getPolymerElement().noink();
    }
    public void setNoink(boolean value) {
        getElement().setAttribute("noink", String.valueOf(value));
    }
    public void setNoink(String noink) {
        setBooleanAttribute("noink", true);
    }




}
