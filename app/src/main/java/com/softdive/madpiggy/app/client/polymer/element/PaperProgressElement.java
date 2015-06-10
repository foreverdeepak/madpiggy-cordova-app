package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperProgressElement extends CoreRangeElement {


    @JsProperty double secondaryProgress();
    @JsProperty void secondaryProgress(double value);

    @JsProperty boolean indeterminate();
    @JsProperty void indeterminate(boolean value);



}