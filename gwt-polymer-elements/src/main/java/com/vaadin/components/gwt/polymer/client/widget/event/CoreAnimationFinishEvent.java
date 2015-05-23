package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimationFinishEvent extends GwtEvent<CoreAnimationFinishEventHandler> {
    public static Type<CoreAnimationFinishEventHandler> TYPE = new Type<CoreAnimationFinishEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent nativeEvent;
    
    public CoreAnimationFinishEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimationFinishEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimationFinishEventHandler handler) {
        handler.onCoreAnimationFinish(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
