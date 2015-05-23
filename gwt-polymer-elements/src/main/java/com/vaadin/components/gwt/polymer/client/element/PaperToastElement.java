package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperToastElement extends PolymerElement {


    @JsProperty String text();
    @JsProperty void text(String value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty boolean opened();
    @JsProperty void opened(boolean value);

    @JsProperty String responsiveWidth();
    @JsProperty void responsiveWidth(String value);

    @JsProperty boolean swipeDisabled();
    @JsProperty void swipeDisabled(boolean value);

    @JsProperty boolean autoCloseDisabled();
    @JsProperty void autoCloseDisabled(boolean value);



    void toggle();

    void show();

    void dismiss();

}