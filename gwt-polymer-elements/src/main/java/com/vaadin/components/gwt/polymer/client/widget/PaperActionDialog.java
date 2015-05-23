package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperActionDialog extends PaperDialogBase {

    public PaperActionDialog(String html) {
        this("paper-action-dialog", html);
    }
    
    public PaperActionDialog(String tag, String html) {
        super(tag, html);

    }

    public PaperActionDialogElement getPolymerElement() {
        return (PaperActionDialogElement) getElement();
    }
    

    public String getCloseSelector() {
        return getPolymerElement().closeSelector();
    }
    public void setCloseSelector(String value) {
        getElement().setAttribute("closeSelector", String.valueOf(value));
    }
    




}
