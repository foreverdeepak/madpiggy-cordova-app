package com.vaadin.components.gwt.polymer.client.element;

import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.alias.*;
import com.vaadin.components.gwt.polymer.client.PolymerElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreIconsetElement extends CoreMetaElement {


    @JsProperty String src();
    @JsProperty void src(String value);

    @JsProperty double width();
    @JsProperty void width(double value);

    @JsProperty String icons();
    @JsProperty void icons(String value);

    @JsProperty double iconSize();
    @JsProperty void iconSize(double value);

    @JsProperty double offsetX();
    @JsProperty void offsetX(double value);

    @JsProperty double offsetY();
    @JsProperty void offsetY(double value);



    void getOffset(Object icon, String theme);

    void applyIcon(Element element, Object icon, double scale);

}