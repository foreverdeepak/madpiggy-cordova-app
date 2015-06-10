package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperDialogElement;

public class PaperDialog extends PaperDialogBase {

    public PaperDialog(String html) {
        this("paper-dialog", html);
    }
    
    public PaperDialog(String tag, String html) {
        super(tag, html);

    }

    public PaperDialogElement getPolymerElement() {
        return (PaperDialogElement) getElement();
    }
    




}
