package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreTransitionCssElement extends CoreTransitionElement {


    @JsProperty String baseClass();
    @JsProperty void baseClass(String value);

    @JsProperty String openedClass();
    @JsProperty void openedClass(String value);

    @JsProperty String closedClass();
    @JsProperty void closedClass(String value);

    @JsProperty String completeEventName();
    @JsProperty void completeEventName(String value);

    @JsProperty String transitionType();
    @JsProperty void transitionType(String value);



}