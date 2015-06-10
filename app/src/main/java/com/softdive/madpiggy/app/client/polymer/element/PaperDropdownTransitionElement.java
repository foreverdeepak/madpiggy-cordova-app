package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperDropdownTransitionElement extends CoreTransitionCssElement {


    @JsProperty double duration();
    @JsProperty void duration(double value);



}