package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class ViewFragment extends PolymerWidget {

    public ViewFragment(String html) {
        this("view-fragment", html);
    }
    
    public ViewFragment(String tag, String html) {
        super(tag, html);

    }

    public ViewFragmentElement getPolymerElement() {
        return (ViewFragmentElement) getElement();
    }
    




}
