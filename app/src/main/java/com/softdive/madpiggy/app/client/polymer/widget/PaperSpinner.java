package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperSpinnerElement;

public class PaperSpinner extends PolymerWidget {

    public PaperSpinner(String html) {
        this("paper-spinner", html);
    }
    
    public PaperSpinner(String tag, String html) {
        super(tag, html);

    }

    public PaperSpinnerElement getPolymerElement() {
        return (PaperSpinnerElement) getElement();
    }
    

    public boolean isActive() {
        return getPolymerElement().active();
    }
    public void setActive(boolean value) {
        getElement().setAttribute("active", String.valueOf(value));
    }
    public void setActive(String active) {
        setBooleanAttribute("active", true);
    }

    public String getAlt() {
        return getPolymerElement().alt();
    }
    public void setAlt(String value) {
        getElement().setAttribute("alt", String.valueOf(value));
    }
    




}
