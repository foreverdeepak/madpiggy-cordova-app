package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperInputDecoratorElement extends PolymerElement {


    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty boolean floatingLabel();
    @JsProperty void floatingLabel(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);

    @JsProperty boolean labelVisible();
    @JsProperty void labelVisible(boolean value);

    @JsProperty boolean isInvalid();
    @JsProperty void isInvalid(boolean value);

    @JsProperty boolean autoValidate();
    @JsProperty void autoValidate(boolean value);

    @JsProperty String error();
    @JsProperty void error(String value);



    void validate();

    void updateLabelVisibility();

}