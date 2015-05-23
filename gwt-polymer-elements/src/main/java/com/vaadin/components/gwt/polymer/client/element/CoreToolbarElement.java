package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreToolbarElement extends PolymerElement {


    @JsProperty String justify();
    @JsProperty void justify(String value);

    @JsProperty String middleJustify();
    @JsProperty void middleJustify(String value);

    @JsProperty String bottomJustify();
    @JsProperty void bottomJustify(String value);



}