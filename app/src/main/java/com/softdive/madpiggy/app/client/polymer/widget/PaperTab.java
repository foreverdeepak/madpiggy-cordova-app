package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperTabElement;

public class PaperTab extends PolymerWidget {

    public PaperTab(String html) {
        this("paper-tab", html);
    }
    
    public PaperTab(String tag, String html) {
        super(tag, html);

    }

    public PaperTabElement getPolymerElement() {
        return (PaperTabElement) getElement();
    }
    

    public boolean isNoink() {
        return getPolymerElement().noink();
    }
    public void setNoink(boolean value) {
        getElement().setAttribute("noink", String.valueOf(value));
    }
    public void setNoink(String noink) {
        setBooleanAttribute("noink", true);
    }




}
