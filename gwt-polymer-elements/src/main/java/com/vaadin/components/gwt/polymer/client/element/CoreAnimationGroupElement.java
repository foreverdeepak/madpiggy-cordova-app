package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreAnimationGroupElement extends PolymerElement {



    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty String type();
    @JsProperty void type(String value);


}