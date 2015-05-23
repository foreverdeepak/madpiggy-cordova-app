package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreAnimationElement extends PolymerElement {



    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty Object keyframes();
    @JsProperty void keyframes(Object value);

    @JsProperty Object customEffect();
    @JsProperty void customEffect(Object value);

    @JsProperty Object composite();
    @JsProperty void composite(Object value);

    @JsProperty Object duration();
    @JsProperty void duration(Object value);

    @JsProperty Object fill();
    @JsProperty void fill(Object value);

    @JsProperty String easing();
    @JsProperty void easing(String value);

    @JsProperty double delay();
    @JsProperty void delay(double value);

    @JsProperty double endDelay();
    @JsProperty void endDelay(double value);

    @JsProperty Object iterations();
    @JsProperty void iterations(Object value);

    @JsProperty double iterationStart();
    @JsProperty void iterationStart(double value);

    @JsProperty Object iterationComposite();
    @JsProperty void iterationComposite(Object value);

    @JsProperty Object direction();
    @JsProperty void direction(Object value);

    @JsProperty double playbackRate();
    @JsProperty void playbackRate(double value);

    @JsProperty boolean autoplay();
    @JsProperty void autoplay(boolean value);


    void play();

    void cancel();

    void finish();

    void pause();

    void hasTarget();

    void apply();

}