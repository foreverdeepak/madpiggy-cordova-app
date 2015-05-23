package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayOpenCompletedEvent extends GwtEvent<CoreOverlayOpenCompletedEventHandler> {
    public static Type<CoreOverlayOpenCompletedEventHandler> TYPE = new Type<CoreOverlayOpenCompletedEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent nativeEvent;
    
    public CoreOverlayOpenCompletedEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayOpenCompletedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayOpenCompletedEventHandler handler) {
        handler.onCoreOverlayOpenCompleted(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenCompletedEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
