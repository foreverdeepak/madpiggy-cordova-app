package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimatedPagesTransitionEndEvent extends GwtEvent<PaperAnimatedPagesTransitionEndEventHandler> {
    public static Type<PaperAnimatedPagesTransitionEndEventHandler> TYPE = new Type<PaperAnimatedPagesTransitionEndEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent nativeEvent;
    
    public PaperAnimatedPagesTransitionEndEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimatedPagesTransitionEndEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimatedPagesTransitionEndEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionEnd(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimatedPagesTransitionEndEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
