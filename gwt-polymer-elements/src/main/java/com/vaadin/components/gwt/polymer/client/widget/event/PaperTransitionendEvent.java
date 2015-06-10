package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperTransitionendEvent extends GwtEvent<PaperTransitionendEventHandler> {
    public static Type<PaperTransitionendEventHandler> TYPE = new Type<PaperTransitionendEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent nativeEvent;
    
    public PaperTransitionendEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperTransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperTransitionendEventHandler handler) {
        handler.onCoreTransitionend(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getNode() {
        return getNativeEvent().getDetail().node();
    }
   
}
