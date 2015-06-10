package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperButtonElement;

public class PaperButton extends PaperButtonBase {

    public PaperButton(String html) {
        this("paper-button", html);
    }
    
    public PaperButton(String tag, String html) {
        super(tag, html);

    }

    public PaperButtonElement getPolymerElement() {
        return (PaperButtonElement) getElement();
    }
    

    public boolean isRaised() {
        return getPolymerElement().raised();
    }
    public void setRaised(boolean value) {
        getElement().setAttribute("raised", String.valueOf(value));
    }
    public void setRaised(String raised) {
        setBooleanAttribute("raised", true);
    }

    public boolean isRecenteringTouch() {
        return getPolymerElement().recenteringTouch();
    }
    public void setRecenteringTouch(boolean value) {
        getElement().setAttribute("recenteringTouch", String.valueOf(value));
    }
    public void setRecenteringTouch(String recenteringTouch) {
        setBooleanAttribute("recenteringTouch", true);
    }

    public boolean isFill() {
        return getPolymerElement().fill();
    }
    public void setFill(boolean value) {
        getElement().setAttribute("fill", String.valueOf(value));
    }
    public void setFill(String fill) {
        setBooleanAttribute("fill", true);
    }




}
