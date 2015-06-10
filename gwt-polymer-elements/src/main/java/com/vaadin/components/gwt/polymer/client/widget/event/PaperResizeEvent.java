package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperResizeEvent extends GwtEvent<PaperResizeEventHandler> {
    public static Type<PaperResizeEventHandler> TYPE = new Type<PaperResizeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent nativeEvent;
    
    public PaperResizeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperResizeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResizeEventHandler handler) {
        handler.onCoreResize(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreResizeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
