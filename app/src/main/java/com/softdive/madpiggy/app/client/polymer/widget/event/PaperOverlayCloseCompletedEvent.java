package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayCloseCompletedEvent extends GwtEvent<PaperOverlayCloseCompletedEventHandler> {
    public static Type<PaperOverlayCloseCompletedEventHandler> TYPE = new Type<PaperOverlayCloseCompletedEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayCloseCompletedEvent nativeEvent;
    
    public PaperOverlayCloseCompletedEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayCloseCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayCloseCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayCloseCompletedEventHandler handler) {
        handler.onCoreOverlayCloseCompleted(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayCloseCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
