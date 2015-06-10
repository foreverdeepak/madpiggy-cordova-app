package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperTabsElement extends IronSelectorElement {


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