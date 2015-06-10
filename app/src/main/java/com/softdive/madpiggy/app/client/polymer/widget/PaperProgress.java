package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperProgressElement;

public class PaperProgress extends CoreRange {

    public PaperProgress(String html) {
        this("paper-progress", html);
    }
    
    public PaperProgress(String tag, String html) {
        super(tag, html);

    }

    public PaperProgressElement getPolymerElement() {
        return (PaperProgressElement) getElement();
    }
    

    public double getSecondaryProgress() {
        return getPolymerElement().secondaryProgress();
    }
    public void setSecondaryProgress(double value) {
        getElement().setAttribute("secondaryProgress", String.valueOf(value));
    }
    public void setSecondaryProgress(String secondaryProgress) {
        getElement().setAttribute("secondaryProgress", secondaryProgress);
    }

    public boolean isIndeterminate() {
        return getPolymerElement().indeterminate();
    }
    public void setIndeterminate(boolean value) {
        getElement().setAttribute("indeterminate", String.valueOf(value));
    }
    public void setIndeterminate(String indeterminate) {
        setBooleanAttribute("indeterminate", true);
    }




}
