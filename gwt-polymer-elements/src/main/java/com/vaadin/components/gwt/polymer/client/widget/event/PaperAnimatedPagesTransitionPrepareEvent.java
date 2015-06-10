package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimatedPagesTransitionPrepareEvent extends GwtEvent<PaperAnimatedPagesTransitionPrepareEventHandler> {
    public static Type<PaperAnimatedPagesTransitionPrepareEventHandler> TYPE = new Type<PaperAnimatedPagesTransitionPrepareEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent nativeEvent;
    
    public PaperAnimatedPagesTransitionPrepareEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimatedPagesTransitionPrepareEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimatedPagesTransitionPrepareEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionPrepare(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionPrepareEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
