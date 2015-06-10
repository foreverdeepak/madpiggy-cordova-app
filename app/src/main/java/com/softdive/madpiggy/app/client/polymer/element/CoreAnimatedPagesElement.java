package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreAnimatedPagesElement extends CoreSelectorElement {


    @JsProperty String transitions();
    @JsProperty void transitions(String value);

    @JsProperty Object lastSelected();
    @JsProperty void lastSelected(Object value);



}