package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayPositionEvent extends GwtEvent<PaperOverlayPositionEventHandler> {
    public static Type<PaperOverlayPositionEventHandler> TYPE = new Type<PaperOverlayPositionEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent nativeEvent;
    
    public PaperOverlayPositionEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayPositionEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayPositionEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayPositionEventHandler handler) {
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
