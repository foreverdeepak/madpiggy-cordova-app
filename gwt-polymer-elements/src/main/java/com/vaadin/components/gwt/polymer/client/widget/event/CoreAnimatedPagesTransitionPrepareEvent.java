package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimatedPagesTransitionPrepareEvent extends GwtEvent<CoreAnimatedPagesTransitionPrepareEventHandler> {
    public static Type<CoreAnimatedPagesTransitionPrepareEventHandler> TYPE = new Type<CoreAnimatedPagesTransitionPrepareEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent nativeEvent;
    
    public CoreAnimatedPagesTransitionPrepareEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimatedPagesTransitionPrepareEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimatedPagesTransitionPrepareEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionPrepare(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
