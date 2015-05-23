package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperSlider extends CoreRange {

    public PaperSlider(String html) {
        this("paper-slider", html);
    }
    
    public PaperSlider(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent event) {
                fireEvent(new CoreChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent event) {
                fireEvent(new ImmediateValueChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent event) {
                fireEvent(new ChangeEvent(event));
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


    public HandlerRegistration addCoreChangeHandler(CoreChangeEventHandler handler) {
        return addHandler(handler, CoreChangeEvent.TYPE);
    }

    public HandlerRegistration addImmediateValueChangeHandler(ImmediateValueChangeEventHandler handler) {
        return addHandler(handler, ImmediateValueChangeEvent.TYPE);
    }

    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, ChangeEvent.TYPE);
    }

}
