package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface PaperActionDialogElement extends PaperDialogBaseElement {


    @JsProperty String closeSelector();
    @JsProperty void closeSelector(String value);



}