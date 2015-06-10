package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayCloseCompletedEvent extends GwtEvent<PaperOverlayCloseCompletedEventHandler> {
    public static Type<PaperOverlayCloseCompletedEventHandler> TYPE = new Type<PaperOverlayCloseCompletedEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent nativeEvent;
    
    public PaperOverlayCloseCompletedEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayCloseCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayCloseCompletedEventHandler handler) {
        handler.onCoreOverlayCloseCompleted(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
