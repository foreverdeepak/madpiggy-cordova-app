package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimatedPagesTransitionEndEvent extends GwtEvent<CoreAnimatedPagesTransitionEndEventHandler> {
    public static Type<CoreAnimatedPagesTransitionEndEventHandler> TYPE = new Type<CoreAnimatedPagesTransitionEndEventHandler>();
    
    private CoreAnimatedPagesTransitionEndEvent nativeEvent;
    
    public CoreAnimatedPagesTransitionEndEvent(CoreAnimatedPagesTransitionEndEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimatedPagesTransitionEndEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimatedPagesTransitionEndEventHandler handler) {
        handler.onCoreAnimatedPagesTransitionEnd(this);
    }
    
    public CoreAnimatedPagesTransitionEndEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
