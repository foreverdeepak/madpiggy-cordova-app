package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperButtonBaseElement;

public class PaperButtonBase extends PolymerWidget {

    public PaperButtonBase(String html) {
        this("paper-button-base", html);
    }
    
    public PaperButtonBase(String tag, String html) {
        super(tag, html);

    }

    public PaperButtonBaseElement getPolymerElement() {
        return (PaperButtonBaseElement) getElement();
    }
    




}
