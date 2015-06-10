package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimationChangeEvent extends GwtEvent<PaperAnimationChangeEventHandler> {
    public static Type<PaperAnimationChangeEventHandler> TYPE = new Type<PaperAnimationChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent nativeEvent;
    
    public PaperAnimationChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimationChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimationChangeEventHandler handler) {
        handler.onCoreAnimationChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreAnimationChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
