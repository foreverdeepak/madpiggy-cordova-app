package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

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