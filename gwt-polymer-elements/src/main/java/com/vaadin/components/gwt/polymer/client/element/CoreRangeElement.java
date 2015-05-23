package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreRangeElement extends PolymerElement {


    @JsProperty double value();
    @JsProperty void value(double value);

    @JsProperty double min();
    @JsProperty void min(double value);

    @JsProperty double max();
    @JsProperty void max(double value);

    @JsProperty double step();
    @JsProperty void step(double value);

    @JsProperty double ratio();
    @JsProperty void ratio(double value);



}