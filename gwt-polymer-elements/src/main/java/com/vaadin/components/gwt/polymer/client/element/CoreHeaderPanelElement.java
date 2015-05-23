package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreHeaderPanelElement extends PolymerElement {


    @JsProperty String mode();
    @JsProperty void mode(String value);

    @JsProperty String tallClass();
    @JsProperty void tallClass(String value);

    @JsProperty boolean shadow();
    @JsProperty void shadow(boolean value);


    @JsProperty Object scroller();
    @JsProperty void scroller(Object value);


}