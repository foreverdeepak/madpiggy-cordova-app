package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperRadioButtonElement extends PolymerElement {


    @JsProperty boolean checked();
    @JsProperty void checked(boolean value);

    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty boolean toggles();
    @JsProperty void toggles(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);



}