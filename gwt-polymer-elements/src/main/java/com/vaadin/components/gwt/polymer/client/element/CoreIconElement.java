package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreIconElement extends PolymerElement {


    @JsProperty String src();
    @JsProperty void src(String value);

    @JsProperty String icon();
    @JsProperty void icon(String value);

    @JsProperty String alt();
    @JsProperty void alt(String value);



}