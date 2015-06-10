package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperRadioGroupElement extends IronSelectorElement {


    @JsProperty String selectedAttribute();
    @JsProperty void selectedAttribute(String value);

    @JsProperty String activateEvent();
    @JsProperty void activateEvent(String value);



}