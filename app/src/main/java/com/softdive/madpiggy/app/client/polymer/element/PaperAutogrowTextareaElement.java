package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperAutogrowTextareaElement extends PolymerElement {


    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty double rows();
    @JsProperty void rows(double value);

    @JsProperty double maxRows();
    @JsProperty void maxRows(double value);



    void update();

}