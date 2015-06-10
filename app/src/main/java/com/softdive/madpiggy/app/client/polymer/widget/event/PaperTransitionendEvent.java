package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperTransitionendEvent extends GwtEvent<PaperTransitionendEventHandler> {
    public static Type<PaperTransitionendEventHandler> TYPE = new Type<PaperTransitionendEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent nativeEvent;
    
    public PaperTransitionendEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent  nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperTransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperTransitionendEventHandler handler) {
        handler.onCoreTransitionend(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getNode() {
        return getNativeEvent().getDetail().node();
    }
   
}
