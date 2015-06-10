package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreResizeEvent extends GwtEvent<CoreResizeEventHandler> {
    public static Type<CoreResizeEventHandler> TYPE = new Type<CoreResizeEventHandler>();
    
    private PaperResizeEvent nativeEvent;
    
    public CoreResizeEvent(PaperResizeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreResizeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreResizeEventHandler handler) {
        handler.onCoreResize(this);
    }
    
    public PaperResizeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
