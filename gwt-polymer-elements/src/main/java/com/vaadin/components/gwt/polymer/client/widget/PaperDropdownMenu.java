package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class PaperDropdownMenu extends CoreDropdownBase {

    public PaperDropdownMenu(String html) {
        this("paper-dropdown-menu", html);
    }
    
    public PaperDropdownMenu(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent event) {
                fireEvent(new CoreSelectEvent(event));
            }
        });

    }

    public PaperDropdownMenuElement getPolymerElement() {
        return (PaperDropdownMenuElement) getElement();
    }
    

    public String getLabel() {
        return getPolymerElement().label();
    }
    public void setLabel(String value) {
        getElement().setAttribute("label", String.valueOf(value));
    }
    

    public String getOpenedIcon() {
        return getPolymerElement().openedIcon();
    }
    public void setOpenedIcon(String value) {
        getElement().setAttribute("openedIcon", String.valueOf(value));
    }
    

    public String getClosedIcon() {
        return getPolymerElement().closedIcon();
    }
    public void setClosedIcon(String value) {
        getElement().setAttribute("closedIcon", String.valueOf(value));
    }
    




    public HandlerRegistration addCoreSelectHandler(CoreSelectEventHandler handler) {
        return addHandler(handler, CoreSelectEvent.TYPE);
    }

}
