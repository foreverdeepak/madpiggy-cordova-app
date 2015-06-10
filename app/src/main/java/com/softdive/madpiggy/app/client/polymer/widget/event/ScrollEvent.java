package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class ScrollEvent extends GwtEvent<ScrollEventHandler> {
    public static Type<ScrollEventHandler> TYPE = new Type<ScrollEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.ScrollEvent nativeEvent;
    
    public ScrollEvent(com.softdive.madpiggy.app.client.polymer.element.event.ScrollEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<ScrollEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ScrollEventHandler handler) {
        handler.onScroll(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.ScrollEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
