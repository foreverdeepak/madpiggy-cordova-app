package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreresizerElement extends CoreresizableElement {



    @JsProperty Object resizerIsPeer();
    @JsProperty void resizerIsPeer(Object value);


    void resizerAttachedHandler();

    void resizerDetachedHandler();

    void notifyResize();

    void resizeerShouldNotify();

}