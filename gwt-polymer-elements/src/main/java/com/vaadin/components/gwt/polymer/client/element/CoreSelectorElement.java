package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreSelectorElement extends PolymerElement {


    @JsProperty Object selected();
    @JsProperty void selected(Object value);

    @JsProperty boolean multi();
    @JsProperty void multi(boolean value);

    @JsProperty String valueattr();
    @JsProperty void valueattr(String value);

    @JsProperty String selectedClass();
    @JsProperty void selectedClass(String value);

    @JsProperty String selectedProperty();
    @JsProperty void selectedProperty(String value);

    @JsProperty String selectedAttribute();
    @JsProperty void selectedAttribute(String value);

    @JsProperty Object selectedItem();
    @JsProperty void selectedItem(Object value);

    @JsProperty Object selectedModel();
    @JsProperty void selectedModel(Object value);

    @JsProperty double selectedIndex();
    @JsProperty void selectedIndex(double value);

    @JsProperty String excludedLocalNames();
    @JsProperty void excludedLocalNames(String value);

    @JsProperty Object target();
    @JsProperty void target(Object value);

    @JsProperty String itemsSelector();
    @JsProperty void itemsSelector(String value);

    @JsProperty String activateEvent();
    @JsProperty void activateEvent(String value);

    @JsProperty boolean notap();
    @JsProperty void notap(boolean value);


    @JsProperty JsArray items();
    @JsProperty void items(JsArray value);


    void selectPrevious(boolean wrapped);

    void selectNext(boolean wrapped);

}