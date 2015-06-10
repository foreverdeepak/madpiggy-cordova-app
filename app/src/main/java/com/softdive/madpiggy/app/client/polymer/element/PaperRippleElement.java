package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperRippleElement extends PolymerElement {


    @JsProperty double initialOpacity();
    @JsProperty void initialOpacity(double value);

    @JsProperty double opacityDecayVelocity();
    @JsProperty void opacityDecayVelocity(double value);



}