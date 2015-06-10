package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayOpenEvent extends GwtEvent<PaperOverlayOpenEventHandler> {
    public static Type<PaperOverlayOpenEventHandler> TYPE = new Type<PaperOverlayOpenEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent nativeEvent;
    
    public PaperOverlayOpenEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayOpenEventHandler handler) {
        handler.onCoreOverlayOpen(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayOpenEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isDetail() {
        return getNativeEvent().getDetail().detail();
    }
   
}
