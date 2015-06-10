package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperAnimatedPagesTransitionEndEvent extends GwtEvent<PaperAnimatedPagesTransitionEndEventHandler> {
    public static Type<PaperAnimatedPagesTransitionEndEventHandler> TYPE = new Type<PaperAnimatedPagesTransitionEndEventHandler>();
    
    private PaperAnimatedPagesTransitionEndEvent nativeEvent;
    
    public PaperAnimatedPagesTransitionEndEvent(PaperAnimatedPagesTransitionEndEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperAnimatedPagesTransitionEndEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperAnimatedPagesTransitionEndEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionEnd(this);
    }
    
    public PaperAnimatedPagesTransitionEndEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
