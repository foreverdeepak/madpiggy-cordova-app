package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperChangeEvent extends GwtEvent<PaperChangeEventHandler> {
    public static Type<PaperChangeEventHandler> TYPE = new Type<PaperChangeEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent nativeEvent;
    
    public PaperChangeEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperChangeEventHandler handler) {
        handler.onCoreChange(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperChangeEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
