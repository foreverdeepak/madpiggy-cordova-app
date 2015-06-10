package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreChangeEvent extends GwtEvent<CoreChangeEventHandler> {
    public static Type<CoreChangeEventHandler> TYPE = new Type<CoreChangeEventHandler>();
    
    private CoreChangeEvent nativeEvent;
    
    public CoreChangeEvent(CoreChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreChangeEventHandler handler) {
        handler.onCoreChange(this);
    }
    
    public CoreChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
