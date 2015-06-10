package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.PaperRadioGroupElement;

public class PaperRadioGroup extends IronSelector {

    public PaperRadioGroup(String html) {
        this("paper-radio-group", html);
    }
    
    public PaperRadioGroup(String tag, String html) {
        super(tag, html);

    }

    public PaperRadioGroupElement getPolymerElement() {
        return (PaperRadioGroupElement) getElement();
    }
    

    public String getSelectedAttribute() {
        return getPolymerElement().selectedAttribute();
    }
    public void setSelectedAttribute(String value) {
        getElement().setAttribute("selectedAttribute", String.valueOf(value));
    }
    

    public String getActivateEvent() {
        return getPolymerElement().activateEvent();
    }
    public void setActivateEvent(String value) {
        getElement().setAttribute("activateEvent", String.valueOf(value));
    }
    




}
