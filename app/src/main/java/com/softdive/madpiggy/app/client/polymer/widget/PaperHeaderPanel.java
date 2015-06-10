package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperHeaderPanelElement;
import com.softdive.madpiggy.app.client.polymer.element.event.ScrollEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEventHandler;

public class PaperHeaderPanel extends PolymerWidget {

    public PaperHeaderPanel(String html) {
        this("paper-header-panel", html);
    }
    
    public PaperHeaderPanel(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
               ScrollEvent.NAME,
                new ScrollEvent.Listener() {
            @Override
            protected void handleEvent(ScrollEvent event) {
                fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEvent(event));
            }
        });

    }

    public PaperHeaderPanelElement getPolymerElement() {
        return (PaperHeaderPanelElement) getElement();
    }
    

    public String getMode() {
        return getPolymerElement().mode();
    }
    public void setMode(String value) {
        getElement().setAttribute("mode", String.valueOf(value));
    }
    

    public String getTallClass() {
        return getPolymerElement().tallClass();
    }
    public void setTallClass(String value) {
        getElement().setAttribute("tallClass", String.valueOf(value));
    }
    

    public boolean isShadow() {
        return getPolymerElement().shadow();
    }
    public void setShadow(boolean value) {
        getElement().setAttribute("shadow", String.valueOf(value));
    }
    public void setShadow(String shadow) {
        setBooleanAttribute("shadow", true);
    }


    public Object getScroller(){
        return getPolymerElement().scroller();
    }
    public void setScroller(Object value) {
        getPolymerElement().scroller(value);
    }

    public void setDrawer(String drawer) {
        getPolymerElement().setAttribute("drawer", drawer);
    }

    public String getDrawer() {
        return getPolymerElement().getAttribute("drawer");
    }

    public HandlerRegistration addScrollHandler(ScrollEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.ScrollEvent.TYPE);
    }

}
