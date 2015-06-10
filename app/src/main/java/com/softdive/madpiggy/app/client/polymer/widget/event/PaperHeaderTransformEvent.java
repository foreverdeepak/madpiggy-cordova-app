package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperHeaderTransformEvent extends GwtEvent<PaperHeaderTransformEventHandler> {
    public static Type<PaperHeaderTransformEventHandler> TYPE = new Type<PaperHeaderTransformEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperHeaderTransformEvent nativeEvent;
    
    public PaperHeaderTransformEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperHeaderTransformEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperHeaderTransformEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperHeaderTransformEventHandler handler) {
        handler.onCoreHeaderTransform(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperHeaderTransformEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
