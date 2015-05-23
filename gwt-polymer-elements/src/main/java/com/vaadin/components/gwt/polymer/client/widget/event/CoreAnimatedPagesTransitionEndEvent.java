package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimatedPagesTransitionEndEvent extends GwtEvent<CoreAnimatedPagesTransitionEndEventHandler> {
    public static Type<CoreAnimatedPagesTransitionEndEventHandler> TYPE = new Type<CoreAnimatedPagesTransitionEndEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent nativeEvent;
    
    public CoreAnimatedPagesTransitionEndEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimatedPagesTransitionEndEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimatedPagesTransitionEndEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionEnd(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
