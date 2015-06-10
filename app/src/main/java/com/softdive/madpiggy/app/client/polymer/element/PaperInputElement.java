package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

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