package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreLabelElement;

public class CoreLabel extends PolymerWidget {

    public CoreLabel(String html) {
        this("core-label", html);
    }
    
    public CoreLabel(String tag, String html) {
        super(tag, html);

    }

    public CoreLabelElement getPolymerElement() {
        return (CoreLabelElement) getElement();
    }
    

    public String getFor() {
        return getPolymerElement().getFor();
    }
    public void setFor(String value) {
        getElement().setAttribute("for", String.valueOf(value));
    }
    




}
