package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.IronInputElement;
import com.softdive.madpiggy.app.client.polymer.webapi.widget.alias.Input;


public class IronInput extends Input {

    public IronInput(String html) {
        this("iron-input", html);
    }
    
    public IronInput(String tag, String html) {
        super(tag, html);

    }

    public IronInputElement getPolymerElement() {
        return (IronInputElement) getElement();
    }
    

    public String getCommittedValue() {
        return getPolymerElement().committedValue();
    }
    public void setCommittedValue(String value) {
        getElement().setAttribute("committedValue", String.valueOf(value));
    }
    

    public boolean isPreventInvalidInput() {
        return getPolymerElement().preventInvalidInput();
    }
    public void setPreventInvalidInput(boolean value) {
        getElement().setAttribute("preventInvalidInput", String.valueOf(value));
    }
    public void setPreventInvalidInput(String preventInvalidInput) {
        setBooleanAttribute("preventInvalidInput", true);
    }



    public void commit() {
        getPolymerElement().commit();
    }


}
