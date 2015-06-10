package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperInputDecoratorElement;

public class PaperInputDecorator extends PolymerWidget {

    public PaperInputDecorator(String html) {
        this("paper-input-decorator", html);
    }
    
    public PaperInputDecorator(String tag, String html) {
        super(tag, html);

    }

    public PaperInputDecoratorElement getPolymerElement() {
        return (PaperInputDecoratorElement) getElement();
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

    public boolean isLabelVisible() {
        return getPolymerElement().labelVisible();
    }
    public void setLabelVisible(boolean value) {
        getElement().setAttribute("labelVisible", String.valueOf(value));
    }
    public void setLabelVisible(String labelVisible) {
        setBooleanAttribute("labelVisible", true);
    }

    public boolean isInvalid() {
        return getPolymerElement().isInvalid();
    }
    public void setIsInvalid(boolean value) {
        getElement().setAttribute("isInvalid", String.valueOf(value));
    }
    public void setIsInvalid(String isInvalid) {
        setBooleanAttribute("isInvalid", true);
    }

    public boolean isAutoValidate() {
        return getPolymerElement().autoValidate();
    }
    public void setAutoValidate(boolean value) {
        getElement().setAttribute("autoValidate", String.valueOf(value));
    }
    public void setAutoValidate(String autoValidate) {
        setBooleanAttribute("autoValidate", true);
    }

    public String getError() {
        return getPolymerElement().error();
    }
    public void setError(String value) {
        getElement().setAttribute("error", String.valueOf(value));
    }
    



    public void validate() {
        getPolymerElement().validate();
    }

    public void updateLabelVisibility() {
        getPolymerElement().updateLabelVisibility();
    }


}
