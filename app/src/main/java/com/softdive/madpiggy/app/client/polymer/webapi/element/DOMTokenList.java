package com.softdive.madpiggy.app.client.polymer.webapi.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface DOMTokenList {

    @JsProperty
    int length();
    
    boolean contains();
}
