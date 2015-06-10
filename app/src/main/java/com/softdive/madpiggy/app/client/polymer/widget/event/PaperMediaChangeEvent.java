package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperMediaChangeEvent extends GwtEvent<PaperMediaChangeEventHandler> {
    public static Type<PaperMediaChangeEventHandler> TYPE = new Type<PaperMediaChangeEventHandler>();
    
    private PaperMediaChangeEvent nativeEvent;
    
    public PaperMediaChangeEvent(PaperMediaChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperMediaChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperMediaChangeEventHandler handler) {
        handler.onCoreMediaChange(this);
    }
    
    public PaperMediaChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
