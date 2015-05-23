package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreResizeEvent extends GwtEvent<CoreResizeEventHandler> {
    public static Type<CoreResizeEventHandler> TYPE = new Type<CoreResizeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent nativeEvent;
    
    public CoreResizeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreResizeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreResizeEventHandler handler) {
        handler.onCoreResize(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
