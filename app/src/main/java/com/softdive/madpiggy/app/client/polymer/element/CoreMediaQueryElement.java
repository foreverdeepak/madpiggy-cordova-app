package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreMediaQueryElement extends PolymerElement {


    @JsProperty Object queryMatches();
    @JsProperty void queryMatches(Object value);

    @JsProperty String query();
    @JsProperty void query(String value);



}