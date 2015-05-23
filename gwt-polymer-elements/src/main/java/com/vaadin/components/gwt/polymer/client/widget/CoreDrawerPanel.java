package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreDrawerPanel extends PolymerWidget {

    public CoreDrawerPanel(String html) {
        this("core-drawer-panel", html);
    }
    
    public CoreDrawerPanel(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent event) {
                fireEvent(new CoreResponsiveChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent event) {
                fireEvent(new CoreSelectEvent(event));
            }
        });

    }

    public CoreDrawerPanelElement getPolymerElement() {
        return (CoreDrawerPanelElement) getElement();
    }
    

    public String getDrawerWidth() {
        return getPolymerElement().drawerWidth();
    }
    public void setDrawerWidth(String value) {
        getElement().setAttribute("drawerWidth", String.valueOf(value));
    }
    

    public String getResponsiveWidth() {
        return getPolymerElement().responsiveWidth();
    }
    public void setResponsiveWidth(String value) {
        getElement().setAttribute("responsiveWidth", String.valueOf(value));
    }
    

    public String getSelected() {
        return getPolymerElement().selected();
    }
    public void setSelected(String value) {
        getElement().setAttribute("selected", String.valueOf(value));
    }
    

    public String getDefaultSelected() {
        return getPolymerElement().defaultSelected();
    }
    public void setDefaultSelected(String value) {
        getElement().setAttribute("defaultSelected", String.valueOf(value));
    }
    

    public boolean isNarrow() {
        return getPolymerElement().narrow();
    }
    public void setNarrow(boolean value) {
        getElement().setAttribute("narrow", String.valueOf(value));
    }
    public void setNarrow(String narrow) {
        setBooleanAttribute("narrow", true);
    }

    public boolean isRightDrawer() {
        return getPolymerElement().rightDrawer();
    }
    public void setRightDrawer(boolean value) {
        getElement().setAttribute("rightDrawer", String.valueOf(value));
    }
    public void setRightDrawer(String rightDrawer) {
        setBooleanAttribute("rightDrawer", true);
    }

    public boolean isDisableSwipe() {
        return getPolymerElement().disableSwipe();
    }
    public void setDisableSwipe(boolean value) {
        getElement().setAttribute("disableSwipe", String.valueOf(value));
    }
    public void setDisableSwipe(String disableSwipe) {
        setBooleanAttribute("disableSwipe", true);
    }

    public boolean isForceNarrow() {
        return getPolymerElement().forceNarrow();
    }
    public void setForceNarrow(boolean value) {
        getElement().setAttribute("forceNarrow", String.valueOf(value));
    }
    public void setForceNarrow(String forceNarrow) {
        setBooleanAttribute("forceNarrow", true);
    }

    public boolean isDisableEdgeSwipe() {
        return getPolymerElement().disableEdgeSwipe();
    }
    public void setDisableEdgeSwipe(boolean value) {
        getElement().setAttribute("disableEdgeSwipe", String.valueOf(value));
    }
    public void setDisableEdgeSwipe(String disableEdgeSwipe) {
        setBooleanAttribute("disableEdgeSwipe", true);
    }



    public void togglePanel() {
        getPolymerElement().togglePanel();
    }

    public void openDrawer() {
        getPolymerElement().openDrawer();
    }

    public void closeDrawer() {
        getPolymerElement().closeDrawer();
    }


    public HandlerRegistration addCoreResponsiveChangeHandler(CoreResponsiveChangeEventHandler handler) {
        return addHandler(handler, CoreResponsiveChangeEvent.TYPE);
    }

    public HandlerRegistration addCoreSelectHandler(CoreSelectEventHandler handler) {
        return addHandler(handler, CoreSelectEvent.TYPE);
    }

}
