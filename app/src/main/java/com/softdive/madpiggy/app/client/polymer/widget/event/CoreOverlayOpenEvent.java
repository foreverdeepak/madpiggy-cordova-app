package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreOverlayOpenEvent extends GwtEvent<CoreOverlayOpenEventHandler> {
    public static Type<CoreOverlayOpenEventHandler> TYPE = new Type<CoreOverlayOpenEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent nativeEvent;
    
    public CoreOverlayOpenEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreOverlayOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreOverlayOpenEventHandler handler) {
        handler.onCoreOverlayOpen(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperOverlayOpenEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isDetail() {
        return getNativeEvent().getDetail().detail();
    }
   
}
