package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreOverlayElement extends PolymerElement {


    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty Object sizingTarget();
    @JsProperty void sizingTarget(Object value);

    @JsProperty boolean opened();
    @JsProperty void opened(boolean value);

    @JsProperty boolean backdrop();
    @JsProperty void backdrop(boolean value);

    @JsProperty boolean layered();
    @JsProperty void layered(boolean value);

    @JsProperty boolean autoCloseDisabled();
    @JsProperty void autoCloseDisabled(boolean value);

    @JsProperty boolean autoFocusDisabled();
    @JsProperty void autoFocusDisabled(boolean value);

    @JsProperty String closeAttribute();
    @JsProperty void closeAttribute(String value);

    @JsProperty String closeSelector();
    @JsProperty void closeSelector(String value);

    @JsProperty String transition();
    @JsProperty void transition(String value);



    void toggle();

    void open();

    void close();

    void resizeHandler();

}