package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.element.CoreMenuElement;

public class CoreMenu extends CoreSelector {

    public CoreMenu(String html) {
        this("core-menu", html);
    }
    
    public CoreMenu(String tag, String html) {
        super(tag, html);

    }

    public CoreMenuElement getPolymerElement() {
        return (CoreMenuElement) getElement();
    }
    




}
