package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.element.PaperSliderElement;
import com.softdive.madpiggy.app.client.polymer.element.event.ChangeEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.ImmediateValueChangeEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent;

public class PaperSlider extends CoreRange {

    public PaperSlider(String html) {
        this("paper-slider", html);
    }
    
    public PaperSlider(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
               PaperChangeEvent.NAME,
                new PaperChangeEvent.Listener() {
            @Override
            protected void handleEvent(PaperChangeEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                ImmediateValueChangeEvent.NAME,
                new ImmediateValueChangeEvent.Listener() {
            @Override
            protected void handleEvent(ImmediateValueChangeEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ImmediateValueChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
               ChangeEvent.NAME,
                new ChangeEvent.Listener() {
            @Override
            protected void handleEvent(ChangeEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent(event));
            }
        });

    }

    public PaperSliderElement getPolymerElement() {
        return (PaperSliderElement) getElement();
    }
    

    public boolean isSnaps() {
        return getPolymerElement().snaps();
    }
    public void setSnaps(boolean value) {
        getElement().setAttribute("snaps", String.valueOf(value));
    }
    public void setSnaps(String snaps) {
        setBooleanAttribute("snaps", true);
    }

    public boolean isPin() {
        return getPolymerElement().pin();
    }
    public void setPin(boolean value) {
        getElement().setAttribute("pin", String.valueOf(value));
    }
    public void setPin(String pin) {
        setBooleanAttribute("pin", true);
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

    public double getSecondaryProgress() {
        return getPolymerElement().secondaryProgress();
    }
    public void setSecondaryProgress(double value) {
        getElement().setAttribute("secondaryProgress", String.valueOf(value));
    }
    public void setSecondaryProgress(String secondaryProgress) {
        getElement().setAttribute("secondaryProgress", secondaryProgress);
    }

    public boolean isEditable() {
        return getPolymerElement().editable();
    }
    public void setEditable(boolean value) {
        getElement().setAttribute("editable", String.valueOf(value));
    }
    public void setEditable(String editable) {
        setBooleanAttribute("editable", true);
    }

    public double getImmediateValue() {
        return getPolymerElement().immediateValue();
    }
    public void setImmediateValue(double value) {
        getElement().setAttribute("immediateValue", String.valueOf(value));
    }
    public void setImmediateValue(String immediateValue) {
        getElement().setAttribute("immediateValue", immediateValue);
    }

    public boolean isDragging() {
        return getPolymerElement().dragging();
    }
    public void setDragging(boolean value) {
        getElement().setAttribute("dragging", String.valueOf(value));
    }
    public void setDragging(String dragging) {
        setBooleanAttribute("dragging", true);
    }



    public void increment() {
        getPolymerElement().increment();
    }

    public void decrement() {
        getPolymerElement().decrement();
    }


    public HandlerRegistration addCoreChangeHandler(com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperChangeEvent.TYPE);
    }

    public HandlerRegistration addImmediateValueChangeHandler(com.softdive.madpiggy.app.client.polymer.widget.event.ImmediateValueChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ImmediateValueChangeEvent.TYPE);
    }

    public HandlerRegistration addChangeHandler(com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ChangeEvent.TYPE);
    }

}
