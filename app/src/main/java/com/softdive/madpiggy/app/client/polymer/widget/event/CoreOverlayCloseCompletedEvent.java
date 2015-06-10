package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayCloseCompletedEvent extends GwtEvent<CoreOverlayCloseCompletedEventHandler> {
    public static Type<CoreOverlayCloseCompletedEventHandler> TYPE = new Type<CoreOverlayCloseCompletedEventHandler>();
    
    private CoreOverlayCloseCompletedEvent nativeEvent;
    
    public CoreOverlayCloseCompletedEvent(CoreOverlayCloseCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayCloseCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayCloseCompletedEventHandler handler) {
        handler.onCoreOverlayCloseCompleted(this);
    }
    
    public CoreOverlayCloseCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
