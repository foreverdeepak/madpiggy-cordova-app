package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Element;

@JsType
public interface IronIconsetElement extends CoreMetaElement {


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