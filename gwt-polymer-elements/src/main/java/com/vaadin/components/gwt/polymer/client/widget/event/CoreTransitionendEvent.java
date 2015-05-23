package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreTransitionendEvent extends GwtEvent<CoreTransitionendEventHandler> {
    public static Type<CoreTransitionendEventHandler> TYPE = new Type<CoreTransitionendEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent nativeEvent;
    
    public CoreTransitionendEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreTransitionendEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreTransitionendEventHandler handler) {
        handler.onCoreTransitionend(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getNode() {
        return getNativeEvent().getDetail().node();
    }
   
}
