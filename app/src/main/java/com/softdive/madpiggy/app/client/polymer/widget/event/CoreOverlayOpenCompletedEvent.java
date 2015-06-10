package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayOpenCompletedEvent extends GwtEvent<CoreOverlayOpenCompletedEventHandler> {
    public static Type<CoreOverlayOpenCompletedEventHandler> TYPE = new Type<CoreOverlayOpenCompletedEventHandler>();
    
    private PaperOverlayOpenCompletedEvent nativeEvent;
    
    public CoreOverlayOpenCompletedEvent(PaperOverlayOpenCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayOpenCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayOpenCompletedEventHandler handler) {
        handler.onCoreOverlayOpenCompleted(this);
    }
    
    public PaperOverlayOpenCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
