package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreKeyHelperElement;

public class CoreKeyHelper extends PolymerWidget {

    public CoreKeyHelper(String html) {
        this("core-key-helper", html);
    }
    
    public CoreKeyHelper(String tag, String html) {
        super(tag, html);

    }

    public CoreKeyHelperElement getPolymerElement() {
        return (CoreKeyHelperElement) getElement();
    }
    




}
