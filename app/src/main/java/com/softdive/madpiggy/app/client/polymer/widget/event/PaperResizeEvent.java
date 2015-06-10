package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperResizeEvent extends GwtEvent<PaperResizeEventHandler> {
    public static Type<PaperResizeEventHandler> TYPE = new Type<PaperResizeEventHandler>();
    
    private PaperResizeEvent nativeEvent;
    
    public PaperResizeEvent(PaperResizeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperResizeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResizeEventHandler handler) {
        handler.onCoreResize(this);
    }
    
    public PaperResizeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
