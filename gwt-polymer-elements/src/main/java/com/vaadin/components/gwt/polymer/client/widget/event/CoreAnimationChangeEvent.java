package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimationChangeEvent extends GwtEvent<CoreAnimationChangeEventHandler> {
    public static Type<CoreAnimationChangeEventHandler> TYPE = new Type<CoreAnimationChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent nativeEvent;
    
    public CoreAnimationChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimationChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimationChangeEventHandler handler) {
        handler.onCoreAnimationChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
