package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperIconButtonElement extends PaperButtonBaseElement {


    @JsProperty String src();
    @JsProperty void src(String value);

    @JsProperty String icon();
    @JsProperty void icon(String value);



}