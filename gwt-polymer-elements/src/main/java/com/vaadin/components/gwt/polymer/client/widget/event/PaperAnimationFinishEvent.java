package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimationFinishEvent extends GwtEvent<PaperAnimationFinishEventHandler> {
    public static Type<PaperAnimationFinishEventHandler> TYPE = new Type<PaperAnimationFinishEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent nativeEvent;
    
    public PaperAnimationFinishEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimationFinishEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimationFinishEventHandler handler) {
        handler.onCoreAnimationFinish(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationFinishEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
