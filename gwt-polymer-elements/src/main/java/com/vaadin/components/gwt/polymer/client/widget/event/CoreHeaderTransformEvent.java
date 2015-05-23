package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreHeaderTransformEvent extends GwtEvent<CoreHeaderTransformEventHandler> {
    public static Type<CoreHeaderTransformEventHandler> TYPE = new Type<CoreHeaderTransformEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent nativeEvent;
    
    public CoreHeaderTransformEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreHeaderTransformEventHandler handler) {
        handler.onCoreHeaderTransform(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreHeaderTransformEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
