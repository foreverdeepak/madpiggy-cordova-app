package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreDropdownElement extends PaperOverlayElement {


    @JsProperty Object relatedTarget();
    @JsProperty void relatedTarget(Object value);

    @JsProperty String halign();
    @JsProperty void halign(String value);

    @JsProperty String valign();
    @JsProperty void valign(String value);



}