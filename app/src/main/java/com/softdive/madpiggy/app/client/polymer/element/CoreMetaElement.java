package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreMetaElement extends PolymerElement {


    @JsProperty String type();
    @JsProperty void type(String value);


    @JsProperty JsArray list();
    @JsProperty void list(JsArray value);


    void byId(String id);

}