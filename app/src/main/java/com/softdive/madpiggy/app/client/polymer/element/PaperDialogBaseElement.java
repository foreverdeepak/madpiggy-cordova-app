package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperDialogBaseElement extends PaperOverlayElement {


    @JsProperty String heading();
    @JsProperty void heading(String value);

    @JsProperty String transition();
    @JsProperty void transition(String value);

    @JsProperty boolean layered();
    @JsProperty void layered(boolean value);



}