package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimatedPagesTransitionPrepareEvent extends GwtEvent<PaperAnimatedPagesTransitionPrepareEventHandler> {
    public static Type<PaperAnimatedPagesTransitionPrepareEventHandler> TYPE = new Type<PaperAnimatedPagesTransitionPrepareEventHandler>();
    
    private PaperAnimatedPagesTransitionPrepareEvent nativeEvent;
    
    public PaperAnimatedPagesTransitionPrepareEvent(PaperAnimatedPagesTransitionPrepareEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimatedPagesTransitionPrepareEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimatedPagesTransitionPrepareEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionPrepare(this);
    }
    
    public PaperAnimatedPagesTransitionPrepareEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
