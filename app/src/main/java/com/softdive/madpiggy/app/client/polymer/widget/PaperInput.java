package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperInputElement;

public class PaperInput extends PolymerWidget {

    public PaperInput(String html) {
        this("paper-input", html);
    }
    
    public PaperInput(String tag, String html) {
        super(tag, html);

    }

    public PaperInputElement getPolymerElement() {
        return (PaperInputElement) getElement();
    }
    

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    

    public boolean isFloatingLabel() {
        return getPolymerElement().floatingLabel();
    }
    public void setFloatingLabel(boolean value) {
        getElement().setAttribute("floatingLabel", String.valueOf(value));
    }
    public void setFloatingLabel(String floatingLabel) {
        setBooleanAttribute("floatingLabel", true);
    }

    public boolean isDisabled() {
        return getPolymerElement().disabled();
    }
    public void setDisabled(boolean value) {
        getElement().setAttribute("disabled", String.valueOf(value));
    }
    public void setDisabled(String disabled) {
        setBooleanAttribute("disabled", true);
    }

    public String getValue() {
        return getPolymerElement().value();
    }
    public void setValue(String value) {
        getElement().setAttribute("value", String.valueOf(value));
    }
    

    public String getCommittedValue() {
        return getPolymerElement().committedValue();
    }
    public void setCommittedValue(String value) {
        getElement().setAttribute("committedValue", String.valueOf(value));
    }
    



    public void focus() {
        getPolymerElement().focus();
    }


}
