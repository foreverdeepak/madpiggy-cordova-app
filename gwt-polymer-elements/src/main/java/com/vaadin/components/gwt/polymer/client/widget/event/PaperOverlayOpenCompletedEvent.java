package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayOpenCompletedEvent extends GwtEvent<PaperOverlayOpenCompletedEventHandler> {
    public static Type<PaperOverlayOpenCompletedEventHandler> TYPE = new Type<PaperOverlayOpenCompletedEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent nativeEvent;
    
    public PaperOverlayOpenCompletedEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayOpenCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayOpenCompletedEventHandler handler) {
        handler.onCoreOverlayOpenCompleted(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
