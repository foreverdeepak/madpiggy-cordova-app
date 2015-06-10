package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface CoreCollapseElement extends PolymerElement {


    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty boolean horizontal();
    @JsProperty void horizontal(boolean value);

    @JsProperty boolean opened();
    @JsProperty void opened(boolean value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty boolean fixedSize();
    @JsProperty void fixedSize(boolean value);

    @JsProperty boolean allowOverflow();
    @JsProperty void allowOverflow(boolean value);



    void toggle();

}