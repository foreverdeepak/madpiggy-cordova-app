package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
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