package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperChangeEvent extends GwtEvent<PaperChangeEventHandler> {
    public static Type<PaperChangeEventHandler> TYPE = new Type<PaperChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent nativeEvent;
    
    public PaperChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperChangeEventHandler handler) {
        handler.onCoreChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
