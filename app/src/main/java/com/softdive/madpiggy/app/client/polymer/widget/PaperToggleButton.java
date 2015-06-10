package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperToggleButtonElement;
import com.softdive.madpiggy.app.client.polymer.element.event.ChangeEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEventHandler;

public class PaperToggleButton extends PolymerWidget {

    public PaperToggleButton(String html) {
        this("paper-toggle-button", html);
    }
    
    public PaperToggleButton(String tag, String html) {
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

    public PaperToggleButtonElement getPolymerElement() {
        return (PaperToggleButtonElement) getElement();
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

    public boolean isDisabled() {
        return getPolymerElement().disabled();
    }
    public void setDisabled(boolean value) {
        getElement().setAttribute("disabled", String.valueOf(value));
    }
    public void setDisabled(String disabled) {
        setBooleanAttribute("disabled", true);
    }




    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent.TYPE);
    }

    public HandlerRegistration addPaperChangeHandler(PaperChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent.TYPE);
    }

}
