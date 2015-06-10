package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreToolbarElement extends PolymerElement {


    @JsProperty String justify();
    @JsProperty void justify(String value);

    @JsProperty String middleJustify();
    @JsProperty void middleJustify(String value);

    @JsProperty String bottomJustify();
    @JsProperty void bottomJustify(String value);



}