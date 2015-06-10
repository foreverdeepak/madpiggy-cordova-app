package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreDropdownBaseElement;

public class CoreDropdownBase extends PolymerWidget {

    public CoreDropdownBase(String html) {
        this("core-dropdown-base", html);
    }
    
    public CoreDropdownBase(String tag, String html) {
        super(tag, html);

    }

    public CoreDropdownBaseElement getPolymerElement() {
        return (CoreDropdownBaseElement) getElement();
    }
    

    public boolean isOpened() {
        return getPolymerElement().opened();
    }
    public void setOpened(boolean value) {
        getElement().setAttribute("opened", String.valueOf(value));
    }
    public void setOpened(String opened) {
        setBooleanAttribute("opened", true);
    }




}
