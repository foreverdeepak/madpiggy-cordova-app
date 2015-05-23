package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreChangeEvent extends GwtEvent<CoreChangeEventHandler> {
    public static Type<CoreChangeEventHandler> TYPE = new Type<CoreChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent nativeEvent;
    
    public CoreChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreChangeEventHandler handler) {
        handler.onCoreChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
