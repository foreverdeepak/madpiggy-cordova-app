package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface ViewPagerElement extends PolymerElement {


    @JsProperty Object tabAttributes();
    @JsProperty void tabAttributes(Object value);

    @JsProperty Object selected();
    @JsProperty void selected(Object value);

    @JsProperty boolean swipeDisabled();
    @JsProperty void swipeDisabled(boolean value);



}