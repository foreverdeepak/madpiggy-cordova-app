package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperSliderElement extends CoreRangeElement {


    @JsProperty boolean snaps();
    @JsProperty void snaps(boolean value);

    @JsProperty boolean pin();
    @JsProperty void pin(boolean value);

    @JsProperty boolean disabled();
    @JsProperty void disabled(boolean value);

    @JsProperty double secondaryProgress();
    @JsProperty void secondaryProgress(double value);

    @JsProperty boolean editable();
    @JsProperty void editable(boolean value);

    @JsProperty double immediateValue();
    @JsProperty void immediateValue(double value);

    @JsProperty boolean dragging();
    @JsProperty void dragging(boolean value);



    void increment();

    void decrement();

}