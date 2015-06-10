package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Element;

@JsType
public interface CoreIconsetSvgElement extends CoreMetaElement {


    @JsProperty double iconSize();
    @JsProperty void iconSize(double value);



    void applyIcon(Element element, Object icon);

    void updateIcons(String css, String method);

}