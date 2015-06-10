package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreHeaderTransformEvent extends GwtEvent<CoreHeaderTransformEventHandler> {
    public static Type<CoreHeaderTransformEventHandler> TYPE = new Type<CoreHeaderTransformEventHandler>();
    
    private CoreHeaderTransformEvent nativeEvent;
    
    public CoreHeaderTransformEvent(CoreHeaderTransformEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreHeaderTransformEventHandler handler) {
        handler.onCoreHeaderTransform(this);
    }
    
    public CoreHeaderTransformEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
