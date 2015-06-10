package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperTabElement extends PolymerElement {


    @JsProperty boolean noink();
    @JsProperty void noink(boolean value);



}