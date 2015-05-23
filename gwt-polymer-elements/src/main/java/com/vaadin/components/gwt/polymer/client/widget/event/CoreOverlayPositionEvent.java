package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayPositionEvent extends GwtEvent<CoreOverlayPositionEventHandler> {
    public static Type<CoreOverlayPositionEventHandler> TYPE = new Type<CoreOverlayPositionEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent nativeEvent;
    
    public CoreOverlayPositionEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayPositionEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayPositionEventHandler handler) {
        handler.onCoreOverlayPosition(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreOverlayPositionEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getTarget() {
        return getNativeEvent().getDetail().target();
    }

    public Object getSizingTarget() {
        return getNativeEvent().getDetail().sizingTarget();
    }

    public Object getOpened() {
        return getNativeEvent().getDetail().opened();
    }
   
}
