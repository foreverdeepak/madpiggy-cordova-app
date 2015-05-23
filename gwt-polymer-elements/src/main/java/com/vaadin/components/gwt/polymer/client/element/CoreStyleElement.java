package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreStyleElement extends PolymerElement {


    @JsProperty String id();
    @JsProperty void id(String value);

    @JsProperty String ref();
    @JsProperty void ref(String value);

    @JsProperty Object list();
    @JsProperty void list(Object value);



}