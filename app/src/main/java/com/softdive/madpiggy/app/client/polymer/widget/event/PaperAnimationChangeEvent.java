package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimationChangeEvent extends GwtEvent<PaperAnimationChangeEventHandler> {
    public static Type<PaperAnimationChangeEventHandler> TYPE = new Type<PaperAnimationChangeEventHandler>();
    
    private PaperAnimationChangeEvent nativeEvent;
    
    public PaperAnimationChangeEvent(PaperAnimationChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimationChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimationChangeEventHandler handler) {
        handler.onCoreAnimationChange(this);
    }
    
    public PaperAnimationChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
