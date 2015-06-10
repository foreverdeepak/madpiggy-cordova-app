package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreMediaChangeEvent extends GwtEvent<CoreMediaChangeEventHandler> {
    public static Type<CoreMediaChangeEventHandler> TYPE = new Type<CoreMediaChangeEventHandler>();
    
    private CoreMediaChangeEvent nativeEvent;
    
    public CoreMediaChangeEvent(CoreMediaChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreMediaChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreMediaChangeEventHandler handler) {
        handler.onCoreMediaChange(this);
    }
    
    public CoreMediaChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
