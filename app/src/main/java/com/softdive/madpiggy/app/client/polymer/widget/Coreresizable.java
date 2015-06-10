package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreresizableElement;

public class Coreresizable extends PolymerWidget {

    public Coreresizable(String html) {
        this("CoreResizable", html);
    }
    
    public Coreresizable(String tag, String html) {
        super(tag, html);

    }

    public CoreresizableElement getPolymerElement() {
        return (CoreresizableElement) getElement();
    }
    



    public void resizableAttachedHandler() {
        getPolymerElement().resizableAttachedHandler();
    }

    public void resizableDetachedHandler() {
        getPolymerElement().resizableDetachedHandler();
    }


}
