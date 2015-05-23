package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class ImmediateValueChangeEvent extends GwtEvent<ImmediateValueChangeEventHandler> {
    public static Type<ImmediateValueChangeEventHandler> TYPE = new Type<ImmediateValueChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent nativeEvent;
    
    public ImmediateValueChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<ImmediateValueChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ImmediateValueChangeEventHandler handler) {
        handler.onImmediateValueChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.ImmediateValueChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
