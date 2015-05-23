package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperInputElement extends PolymerElement {


    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty boolean floatingLabel();
    @JsProperty void floatingLabel(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);

    @JsProperty String value();
    @JsProperty void value(String value);

    @JsProperty String committedValue();
    @JsProperty void committedValue(String value);



    void focus();

}