package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperMediaChangeEvent extends GwtEvent<PaperMediaChangeEventHandler> {
    public static Type<PaperMediaChangeEventHandler> TYPE = new Type<PaperMediaChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent nativeEvent;
    
    public PaperMediaChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperMediaChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperMediaChangeEventHandler handler) {
        handler.onCoreMediaChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreMediaChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
