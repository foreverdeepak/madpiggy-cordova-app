package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreMediaChangeEvent extends GwtEvent<CoreMediaChangeEventHandler> {
    public static Type<CoreMediaChangeEventHandler> TYPE = new Type<CoreMediaChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent nativeEvent;
    
    public CoreMediaChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreMediaChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreMediaChangeEventHandler handler) {
        handler.onCoreMediaChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
