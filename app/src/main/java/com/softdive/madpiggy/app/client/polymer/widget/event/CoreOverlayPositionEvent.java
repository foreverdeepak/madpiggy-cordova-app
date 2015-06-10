package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayPositionEvent extends GwtEvent<CoreOverlayPositionEventHandler> {
    public static Type<CoreOverlayPositionEventHandler> TYPE = new Type<CoreOverlayPositionEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent nativeEvent;
    
    public CoreOverlayPositionEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayPositionEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayPositionEventHandler handler) {
        handler.onCoreOverlayPosition(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent getNativeEvent() {
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
