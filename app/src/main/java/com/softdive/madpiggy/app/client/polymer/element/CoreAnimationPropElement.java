package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreAnimationPropElement extends PolymerElement {



    @JsProperty String name();
    @JsProperty void name(String value);

    @JsProperty Object value();
    @JsProperty void value(Object value);


}