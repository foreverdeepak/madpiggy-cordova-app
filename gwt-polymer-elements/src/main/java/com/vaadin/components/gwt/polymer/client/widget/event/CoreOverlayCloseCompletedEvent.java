package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayCloseCompletedEvent extends GwtEvent<CoreOverlayCloseCompletedEventHandler> {
    public static Type<CoreOverlayCloseCompletedEventHandler> TYPE = new Type<CoreOverlayCloseCompletedEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent nativeEvent;
    
    public CoreOverlayCloseCompletedEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayCloseCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayCloseCompletedEventHandler handler) {
        handler.onCoreOverlayCloseCompleted(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayCloseCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
