package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface IronIconElement extends PolymerElement {


    @JsProperty String src();
    @JsProperty void src(String value);

    @JsProperty String icon();
    @JsProperty void icon(String value);

    @JsProperty String alt();
    @JsProperty void alt(String value);



}