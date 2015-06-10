package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.IronMenuElement;

public class IronMenu extends IronSelector {

    public IronMenu(String html) {
        this("iron-menu", html);
    }
    
    public IronMenu(String tag, String html) {
        super(tag, html);

    }

    public IronMenuElement getPolymerElement() {
        return (IronMenuElement) getElement();
    }
}
