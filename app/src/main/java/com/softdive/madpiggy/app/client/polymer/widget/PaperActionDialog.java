package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperActionDialogElement;

public class PaperActionDialog extends PaperDialogBase {

    public PaperActionDialog(String html) {
        this("paper-action-dialog", html);
    }
    
    public PaperActionDialog(String tag, String html) {
        super(tag, html);

    }

    public PaperActionDialogElement getPolymerElement() {
        return (PaperActionDialogElement) getElement();
    }
    

    public String getCloseSelector() {
        return getPolymerElement().closeSelector();
    }
    public void setCloseSelector(String value) {
        getElement().setAttribute("closeSelector", String.valueOf(value));
    }
    




}
