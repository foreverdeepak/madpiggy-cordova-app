package com.softdive.madpiggy.app.client.polymer.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.PolymerElement;

@JsType
public interface PaperSelectionElement extends PolymerElement {


    @JsProperty boolean multi();
    @JsProperty void multi(boolean value);



    void getSelection();

    void isSelected(Object item);

    void select();

    void toggle();

}