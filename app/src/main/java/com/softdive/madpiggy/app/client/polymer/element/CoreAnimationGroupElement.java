package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreAnimationGroupElement extends PolymerElement {



    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty String type();
    @JsProperty void type(String value);


}