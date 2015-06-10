package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperCharCounterElement extends PolymerElement {


    @JsProperty String target();
    @JsProperty void target(String value);

    @JsProperty boolean showCounter();
    @JsProperty void showCounter(boolean value);



}