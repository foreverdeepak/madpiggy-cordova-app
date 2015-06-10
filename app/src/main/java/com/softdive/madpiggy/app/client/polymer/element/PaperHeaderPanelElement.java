package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperHeaderPanelElement extends PolymerElement {


    @JsProperty String mode();
    @JsProperty void mode(String value);

    @JsProperty String tallClass();
    @JsProperty void tallClass(String value);

    @JsProperty boolean shadow();
    @JsProperty void shadow(boolean value);


    @JsProperty Object scroller();
    @JsProperty void scroller(Object value);


}