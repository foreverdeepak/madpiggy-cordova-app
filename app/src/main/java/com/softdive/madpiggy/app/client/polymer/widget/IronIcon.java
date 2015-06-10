package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.IronIconElement;

public class IronIcon extends PolymerWidget {

    public IronIcon(String html) {
        this("iron-icon", html);
    }
    
    public IronIcon(String tag, String html) {
        super(tag, html);

    }

    public IronIconElement getPolymerElement() {
        return (IronIconElement) getElement();
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
    

    public String getAlt() {
        return getPolymerElement().alt();
    }
    public void setAlt(String value) {
        getElement().setAttribute("alt", String.valueOf(value));
    }
    




}
