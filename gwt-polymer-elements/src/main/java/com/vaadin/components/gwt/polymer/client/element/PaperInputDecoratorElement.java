package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperInputDecoratorElement extends PolymerElement {


    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty boolean floatingLabel();
    @JsProperty void floatingLabel(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);

    @JsProperty boolean labelVisible();
    @JsProperty void labelVisible(boolean value);

    @JsProperty boolean isInvalid();
    @JsProperty void isInvalid(boolean value);

    @JsProperty boolean autoValidate();
    @JsProperty void autoValidate(boolean value);

    @JsProperty String error();
    @JsProperty void error(String value);



    void validate();

    void updateLabelVisibility();

}