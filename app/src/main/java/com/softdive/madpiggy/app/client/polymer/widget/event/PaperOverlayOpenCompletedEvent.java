package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayOpenCompletedEvent extends GwtEvent<PaperOverlayOpenCompletedEventHandler> {
    public static Type<PaperOverlayOpenCompletedEventHandler> TYPE = new Type<PaperOverlayOpenCompletedEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenCompletedEvent nativeEvent;
    
    public PaperOverlayOpenCompletedEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayOpenCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayOpenCompletedEventHandler handler) {
        handler.onCoreOverlayOpenCompleted(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
