package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperToastElement extends PolymerElement {


    @JsProperty String text();
    @JsProperty void text(String value);

    @JsProperty double duration();
    @JsProperty void duration(double value);

    @JsProperty boolean opened();
    @JsProperty void opened(boolean value);

    @JsProperty String responsiveWidth();
    @JsProperty void responsiveWidth(String value);

    @JsProperty boolean swipeDisabled();
    @JsProperty void swipeDisabled(boolean value);

    @JsProperty boolean autoCloseDisabled();
    @JsProperty void autoCloseDisabled(boolean value);



    void toggle();

    void show();

    void dismiss();

}