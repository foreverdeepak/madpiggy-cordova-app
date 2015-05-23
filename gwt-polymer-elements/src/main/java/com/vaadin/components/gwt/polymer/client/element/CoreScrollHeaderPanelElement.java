package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreScrollHeaderPanelElement extends PolymerElement {


    @JsProperty boolean condenses();
    @JsProperty void condenses(boolean value);

    @JsProperty boolean noDissolve();
    @JsProperty void noDissolve(boolean value);

    @JsProperty boolean noReveal();
    @JsProperty void noReveal(boolean value);

    @JsProperty boolean fixed();
    @JsProperty void fixed(boolean value);

    @JsProperty boolean keepCondensedHeader();
    @JsProperty void keepCondensedHeader(boolean value);

    @JsProperty double headerHeight();
    @JsProperty void headerHeight(double value);

    @JsProperty double condensedHeaderHeight();
    @JsProperty void condensedHeaderHeight(double value);

    @JsProperty boolean scrollAwayTopbar();
    @JsProperty void scrollAwayTopbar(boolean value);


    @JsProperty Object scroller();
    @JsProperty void scroller(Object value);


    void measureHeaderHeight();

}