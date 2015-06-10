package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperDropdownTransitionElement;

public class PaperDropdownTransition extends CoreTransitionCss {

    public PaperDropdownTransition(String html) {
        this("paper-dropdown-transition", html);
    }
    
    public PaperDropdownTransition(String tag, String html) {
        super(tag, html);

    }

    public PaperDropdownTransitionElement getPolymerElement() {
        return (PaperDropdownTransitionElement) getElement();
    }
    

    public double getDuration() {
        return getPolymerElement().duration();
    }
    public void setDuration(double value) {
        getElement().setAttribute("duration", String.valueOf(value));
    }
    public void setDuration(String duration) {
        getElement().setAttribute("duration", duration);
    }




}
