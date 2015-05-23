package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayOpenEvent extends GwtEvent<CoreOverlayOpenEventHandler> {
    public static Type<CoreOverlayOpenEventHandler> TYPE = new Type<CoreOverlayOpenEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent nativeEvent;
    
    public CoreOverlayOpenEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayOpenEventHandler handler) {
        handler.onCoreOverlayOpen(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isDetail() {
        return getNativeEvent().getDetail().detail();
    }
   
}
