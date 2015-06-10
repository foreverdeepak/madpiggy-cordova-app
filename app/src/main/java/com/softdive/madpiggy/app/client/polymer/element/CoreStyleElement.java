package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreStyleElement extends PolymerElement {


    @JsProperty String id();
    @JsProperty void id(String value);

    @JsProperty String ref();
    @JsProperty void ref(String value);

    @JsProperty Object list();
    @JsProperty void list(Object value);



}