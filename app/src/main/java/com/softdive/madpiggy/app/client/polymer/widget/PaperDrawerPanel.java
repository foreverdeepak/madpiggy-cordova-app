package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperDrawerPanelElement;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperResponsiveChangeEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperResponsiveChangeEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEventHandler;

public class PaperDrawerPanel extends PolymerWidget {

    public PaperDrawerPanel(String html) {
        this("paper-drawer-panel", html);
    }
    
    public PaperDrawerPanel(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
        		com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent.NAME,
                new com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent event) {
                fireEvent(new PaperResponsiveChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
        		com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent.NAME,
                new com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent event) {
                fireEvent(new PaperSelectEvent(event));
            }
        });

    }

    public PaperDrawerPanelElement getPolymerElement() {
        return (PaperDrawerPanelElement) getElement();
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


    public HandlerRegistration addPaperResponsiveChangeHandler(PaperResponsiveChangeEventHandler handler) {
        return addHandler(handler, PaperResponsiveChangeEvent.TYPE);
    }

    public HandlerRegistration addCoreSelectHandler(PaperSelectEventHandler handler) {
        return addHandler(handler, PaperSelectEvent.TYPE);
    }

}
