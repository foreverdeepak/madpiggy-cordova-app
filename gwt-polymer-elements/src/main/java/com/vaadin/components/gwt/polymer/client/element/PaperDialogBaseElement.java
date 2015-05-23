package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperDialogBaseElement extends CoreOverlayElement {


    @JsProperty String heading();
    @JsProperty void heading(String value);

    @JsProperty String transition();
    @JsProperty void transition(String value);

    @JsProperty boolean layered();
    @JsProperty void layered(boolean value);



}