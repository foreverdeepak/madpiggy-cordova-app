package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimationFinishEvent extends GwtEvent<CoreAnimationFinishEventHandler> {
    public static Type<CoreAnimationFinishEventHandler> TYPE = new Type<CoreAnimationFinishEventHandler>();
    
    private CoreAnimationFinishEvent nativeEvent;
    
    public CoreAnimationFinishEvent(CoreAnimationFinishEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimationFinishEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimationFinishEventHandler handler) {
        handler.onCoreAnimationFinish(this);
    }
    
    public CoreAnimationFinishEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
