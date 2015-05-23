package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreCollapseElement extends PolymerElement {


    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty boolean horizontal();
    @JsProperty void horizontal(boolean value);

    @JsProperty boolean opened();
    @JsProperty void opened(boolean value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty boolean fixedSize();
    @JsProperty void fixedSize(boolean value);

    @JsProperty boolean allowOverflow();
    @JsProperty void allowOverflow(boolean value);



    void toggle();

}