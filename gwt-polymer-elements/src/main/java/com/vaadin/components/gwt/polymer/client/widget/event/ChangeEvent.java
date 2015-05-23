package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class ChangeEvent extends GwtEvent<ChangeEventHandler> {
    public static Type<ChangeEventHandler> TYPE = new Type<ChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent nativeEvent;
    
    public ChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<ChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ChangeEventHandler handler) {
        handler.onChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.ChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
