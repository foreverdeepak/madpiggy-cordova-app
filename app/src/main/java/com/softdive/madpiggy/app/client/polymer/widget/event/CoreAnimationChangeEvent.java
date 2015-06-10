package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreAnimationChangeEvent extends GwtEvent<CoreAnimationChangeEventHandler> {
    public static Type<CoreAnimationChangeEventHandler> TYPE = new Type<CoreAnimationChangeEventHandler>();
    
    private CoreAnimationChangeEvent nativeEvent;
    
    public CoreAnimationChangeEvent(CoreAnimationChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreAnimationChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreAnimationChangeEventHandler handler) {
        handler.onCoreAnimationChange(this);
    }
    
    public CoreAnimationChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
