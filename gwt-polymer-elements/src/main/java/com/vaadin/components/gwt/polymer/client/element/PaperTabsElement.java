package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperTabsElement extends CoreSelectorElement {


    @JsProperty boolean noink();
    @JsProperty void noink(boolean value);

    @JsProperty boolean nobar();
    @JsProperty void nobar(boolean value);

    @JsProperty boolean noslide();
    @JsProperty void noslide(boolean value);

    @JsProperty boolean scrollable();
    @JsProperty void scrollable(boolean value);

    @JsProperty boolean disableDrag();
    @JsProperty void disableDrag(boolean value);

    @JsProperty boolean hideScrollButton();
    @JsProperty void hideScrollButton(boolean value);

    @JsProperty boolean alignBottom();
    @JsProperty void alignBottom(boolean value);



    void updateBar();

}