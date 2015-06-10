package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperCharCounterElement;

public class PaperCharCounter extends PolymerWidget {

    public PaperCharCounter(String html) {
        this("paper-char-counter", html);
    }
    
    public PaperCharCounter(String tag, String html) {
        super(tag, html);

    }

    public PaperCharCounterElement getPolymerElement() {
        return (PaperCharCounterElement) getElement();
    }
    

    public String getTarget() {
        return getPolymerElement().target();
    }
    public void setTarget(String value) {
        getElement().setAttribute("target", String.valueOf(value));
    }
    

    public boolean isShowCounter() {
        return getPolymerElement().showCounter();
    }
    public void setShowCounter(boolean value) {
        getElement().setAttribute("showCounter", String.valueOf(value));
    }
    public void setShowCounter(String showCounter) {
        setBooleanAttribute("showCounter", true);
    }




}
