package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperRadioButtonElement extends PolymerElement {


    @JsProperty boolean checked();
    @JsProperty void checked(boolean value);

    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty boolean toggles();
    @JsProperty void toggles(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);



}