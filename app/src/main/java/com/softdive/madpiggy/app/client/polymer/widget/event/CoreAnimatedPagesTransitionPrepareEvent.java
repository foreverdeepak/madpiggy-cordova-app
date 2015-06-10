package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimatedPagesTransitionPrepareEvent extends GwtEvent<CoreAnimatedPagesTransitionPrepareEventHandler> {
    public static Type<CoreAnimatedPagesTransitionPrepareEventHandler> TYPE = new Type<CoreAnimatedPagesTransitionPrepareEventHandler>();
    
    private CoreAnimatedPagesTransitionPrepareEvent nativeEvent;
    
    public CoreAnimatedPagesTransitionPrepareEvent(CoreAnimatedPagesTransitionPrepareEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimatedPagesTransitionPrepareEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimatedPagesTransitionPrepareEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionPrepare(this);
    }
    
    public CoreAnimatedPagesTransitionPrepareEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
