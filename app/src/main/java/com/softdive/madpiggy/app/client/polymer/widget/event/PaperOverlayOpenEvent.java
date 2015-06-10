package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperOverlayOpenEvent extends GwtEvent<PaperOverlayOpenEventHandler> {
    public static Type<PaperOverlayOpenEventHandler> TYPE = new Type<PaperOverlayOpenEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent nativeEvent;
    
    public PaperOverlayOpenEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperOverlayOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperOverlayOpenEventHandler handler) {
        handler.onCoreOverlayOpen(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isDetail() {
        return getNativeEvent().getDetail().detail();
    }
   
}
