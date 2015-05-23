package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperRippleElement extends PolymerElement {


    @JsProperty double initialOpacity();
    @JsProperty void initialOpacity(double value);

    @JsProperty double opacityDecayVelocity();
    @JsProperty void opacityDecayVelocity(double value);



}