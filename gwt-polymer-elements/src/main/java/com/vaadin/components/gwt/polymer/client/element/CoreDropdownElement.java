package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreDropdownElement extends CoreOverlayElement {


    @JsProperty Object relatedTarget();
    @JsProperty void relatedTarget(Object value);

    @JsProperty String halign();
    @JsProperty void halign(String value);

    @JsProperty String valign();
    @JsProperty void valign(String value);



}