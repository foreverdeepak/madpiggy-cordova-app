package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimationFinishEvent extends GwtEvent<PaperAnimationFinishEventHandler> {
    public static Type<PaperAnimationFinishEventHandler> TYPE = new Type<PaperAnimationFinishEventHandler>();
    
    private PaperAnimationFinishEvent nativeEvent;
    
    public PaperAnimationFinishEvent(PaperAnimationFinishEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimationFinishEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimationFinishEventHandler handler) {
        handler.onCoreAnimationFinish(this);
    }
    
    public PaperAnimationFinishEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
