package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.alias.InputElement;

@JsType
public interface IronInputElement extends InputElement {


    @JsProperty String committedValue();
    @JsProperty void committedValue(String value);

    @JsProperty boolean preventInvalidInput();
    @JsProperty void preventInvalidInput(boolean value);



    void commit();

}