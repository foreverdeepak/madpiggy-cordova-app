package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperSpinnerElement extends PolymerElement {


    @JsProperty boolean active();
    @JsProperty void active(boolean value);

    @JsProperty String alt();
    @JsProperty void alt(String value);



}