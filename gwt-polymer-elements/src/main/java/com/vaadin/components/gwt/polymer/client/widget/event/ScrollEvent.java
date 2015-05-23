package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class ScrollEvent extends GwtEvent<ScrollEventHandler> {
    public static Type<ScrollEventHandler> TYPE = new Type<ScrollEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent nativeEvent;
    
    public ScrollEvent(com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<ScrollEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ScrollEventHandler handler) {
        handler.onScroll(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.ScrollEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
