package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
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