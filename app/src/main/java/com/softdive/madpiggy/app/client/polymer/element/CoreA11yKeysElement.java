package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreA11yKeysElement extends PolymerElement {


    @JsProperty String keys();
    @JsProperty void keys(String value);

    @JsProperty Object target();
    @JsProperty void target(Object value);



}