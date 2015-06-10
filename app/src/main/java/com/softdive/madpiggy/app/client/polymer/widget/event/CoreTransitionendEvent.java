package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreTransitionendEvent extends GwtEvent<CoreTransitionendEventHandler> {
    public static Type<CoreTransitionendEventHandler> TYPE = new Type<CoreTransitionendEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent nativeEvent;
    
    public CoreTransitionendEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreTransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreTransitionendEventHandler handler) {
        handler.onCoreTransitionend(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getNode() {
        return getNativeEvent().getDetail().node();
    }
   
}
