package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperIconButtonElement;

public class PaperIconButton extends PaperButtonBase {

    public PaperIconButton(String html) {
        this("paper-icon-button", html);
    }
    
    public PaperIconButton(String tag, String html) {
        super(tag, html);

    }

    public PaperIconButtonElement getPolymerElement() {
        return (PaperIconButtonElement) getElement();
    }
    

    public String getSrc() {
        return getPolymerElement().src();
    }
    public void setSrc(String value) {
        getElement().setAttribute("src", String.valueOf(value));
    }
    

    public String getIcon() {
        return getPolymerElement().icon();
    }
    public void setIcon(String value) {
        getElement().setAttribute("icon", String.valueOf(value));
    }
    




}
