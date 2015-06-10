package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperDialogBaseElement;

public class PaperDialogBase extends PaperOverlay {

    public PaperDialogBase(String html) {
        this("paper-dialog-base", html);
    }
    
    public PaperDialogBase(String tag, String html) {
        super(tag, html);

    }

    public PaperDialogBaseElement getPolymerElement() {
        return (PaperDialogBaseElement) getElement();
    }
    

    public String getHeading() {
        return getPolymerElement().heading();
    }
    public void setHeading(String value) {
        getElement().setAttribute("heading", String.valueOf(value));
    }
    

    public String getTransition() {
        return getPolymerElement().transition();
    }
    public void setTransition(String value) {
        getElement().setAttribute("transition", String.valueOf(value));
    }
    

    public boolean isLayered() {
        return getPolymerElement().layered();
    }
    public void setLayered(boolean value) {
        getElement().setAttribute("layered", String.valueOf(value));
    }
    public void setLayered(String layered) {
        setBooleanAttribute("layered", true);
    }




}
