package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperTabs extends CoreSelector {

    public PaperTabs(String html) {
        this("paper-tabs", html);
    }
    
    public PaperTabs(String tag, String html) {
        super(tag, html);

    }

    public PaperTabsElement getPolymerElement() {
        return (PaperTabsElement) getElement();
    }
    

    public boolean isNoink() {
        return getPolymerElement().noink();
    }
    public void setNoink(boolean value) {
        getElement().setAttribute("noink", String.valueOf(value));
    }
    public void setNoink(String noink) {
        setBooleanAttribute("noink", true);
    }

    public boolean isNobar() {
        return getPolymerElement().nobar();
    }
    public void setNobar(boolean value) {
        getElement().setAttribute("nobar", String.valueOf(value));
    }
    public void setNobar(String nobar) {
        setBooleanAttribute("nobar", true);
    }

    public boolean isNoslide() {
        return getPolymerElement().noslide();
    }
    public void setNoslide(boolean value) {
        getElement().setAttribute("noslide", String.valueOf(value));
    }
    public void setNoslide(String noslide) {
        setBooleanAttribute("noslide", true);
    }

    public boolean isScrollable() {
        return getPolymerElement().scrollable();
    }
    public void setScrollable(boolean value) {
        getElement().setAttribute("scrollable", String.valueOf(value));
    }
    public void setScrollable(String scrollable) {
        setBooleanAttribute("scrollable", true);
    }

    public boolean isDisableDrag() {
        return getPolymerElement().disableDrag();
    }
    public void setDisableDrag(boolean value) {
        getElement().setAttribute("disableDrag", String.valueOf(value));
    }
    public void setDisableDrag(String disableDrag) {
        setBooleanAttribute("disableDrag", true);
    }

    public boolean isHideScrollButton() {
        return getPolymerElement().hideScrollButton();
    }
    public void setHideScrollButton(boolean value) {
        getElement().setAttribute("hideScrollButton", String.valueOf(value));
    }
    public void setHideScrollButton(String hideScrollButton) {
        setBooleanAttribute("hideScrollButton", true);
    }

    public boolean isAlignBottom() {
        return getPolymerElement().alignBottom();
    }
    public void setAlignBottom(boolean value) {
        getElement().setAttribute("alignBottom", String.valueOf(value));
    }
    public void setAlignBottom(String alignBottom) {
        setBooleanAttribute("alignBottom", true);
    }



    public void updateBar() {
        getPolymerElement().updateBar();
    }


}
