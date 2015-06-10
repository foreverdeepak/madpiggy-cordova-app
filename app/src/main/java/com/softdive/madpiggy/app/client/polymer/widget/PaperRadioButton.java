package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperRadioButtonElement;
import com.softdive.madpiggy.app.client.polymer.element.event.ChangeEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.CoreChangeEvent;

public class PaperRadioButton extends PolymerWidget {

    public PaperRadioButton(String html) {
        this("paper-radio-button", html);
    }
    
    public PaperRadioButton(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
              ChangeEvent.NAME,
                new ChangeEvent.Listener() {
            @Override
            protected void handleEvent(ChangeEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                PaperChangeEvent.NAME,
                new PaperChangeEvent.Listener() {
            @Override
            protected void handleEvent(PaperChangeEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent(event));
            }
        });

    }

    public PaperRadioButtonElement getPolymerElement() {
        return (PaperRadioButtonElement) getElement();
    }
    

    public boolean isChecked() {
        return getPolymerElement().checked();
    }
    public void setChecked(boolean value) {
        getElement().setAttribute("checked", String.valueOf(value));
    }
    public void setChecked(String checked) {
        setBooleanAttribute("checked", true);
    }

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    

    public boolean isToggles() {
        return getPolymerElement().toggles();
    }
    public void setToggles(boolean value) {
        getElement().setAttribute("toggles", String.valueOf(value));
    }
    public void setToggles(String toggles) {
        setBooleanAttribute("toggles", true);
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




    public HandlerRegistration addChangeHandler(com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent.TYPE);
    }

    public HandlerRegistration addCoreChangeHandler(com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent.TYPE);
    }

}
