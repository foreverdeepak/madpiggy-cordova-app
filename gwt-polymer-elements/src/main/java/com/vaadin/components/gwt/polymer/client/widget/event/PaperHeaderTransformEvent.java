package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperHeaderTransformEvent extends GwtEvent<PaperHeaderTransformEventHandler> {
    public static Type<PaperHeaderTransformEventHandler> TYPE = new Type<PaperHeaderTransformEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent nativeEvent;
    
    public PaperHeaderTransformEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperHeaderTransformEventHandler handler) {
        handler.onCoreHeaderTransform(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
