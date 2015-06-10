package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperMenuButtonElement;

public class PaperMenuButton extends CoreDropdownBase {

    public PaperMenuButton(String html) {
        this("paper-menu-button", html);
    }
    
    public PaperMenuButton(String tag, String html) {
        super(tag, html);

    }

    public PaperMenuButtonElement getPolymerElement() {
        return (PaperMenuButtonElement) getElement();
    }
    




}
