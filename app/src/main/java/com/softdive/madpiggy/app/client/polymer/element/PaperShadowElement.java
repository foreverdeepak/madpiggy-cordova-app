package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperShadowElement extends PolymerElement {


    @JsProperty double z();
    @JsProperty void z(double value);

    @JsProperty boolean animated();
    @JsProperty void animated(boolean value);



    void setZ();

}