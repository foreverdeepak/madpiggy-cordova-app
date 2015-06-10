package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperFabElement;

public class PaperFab extends PaperButtonBase {

    public PaperFab(String html) {
        this("paper-fab", html);
    }
    
    public PaperFab(String tag, String html) {
        super(tag, html);

    }

    public PaperFabElement getPolymerElement() {
        return (PaperFabElement) getElement();
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
    

    public boolean isMini() {
        return getPolymerElement().mini();
    }
    public void setMini(boolean value) {
        getElement().setAttribute("mini", String.valueOf(value));
    }
    public void setMini(String mini) {
        setBooleanAttribute("mini", true);
    }




}
