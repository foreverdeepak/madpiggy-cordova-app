package com.vaadin.components.gwt.polymer.client.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperItemElement extends PaperButtonBaseElement {


    @JsProperty boolean raised();
    @JsProperty void raised(boolean value);

    @JsProperty boolean recenteringTouch();
    @JsProperty void recenteringTouch(boolean value);

    @JsProperty boolean fill();
    @JsProperty void fill(boolean value);



}