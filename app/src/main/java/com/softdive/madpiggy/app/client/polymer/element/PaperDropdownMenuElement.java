package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperDropdownMenuElement extends CoreDropdownBaseElement {


    @JsProperty String label();
    @JsProperty void label(String value);

    @JsProperty String openedIcon();
    @JsProperty void openedIcon(String value);

    @JsProperty String closedIcon();
    @JsProperty void closedIcon(String value);



}