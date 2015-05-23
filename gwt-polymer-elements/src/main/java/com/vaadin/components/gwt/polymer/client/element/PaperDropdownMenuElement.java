package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperDropdownMenuElement extends CoreDropdownBaseElement {


    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty String openedIcon();
    @JsProperty void openedIcon(String value);

    @JsProperty String closedIcon();
    @JsProperty void closedIcon(String value);



}