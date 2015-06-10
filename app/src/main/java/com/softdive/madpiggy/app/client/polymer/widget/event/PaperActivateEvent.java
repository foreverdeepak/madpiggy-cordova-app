package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperActivateEvent extends GwtEvent<PaperActivateEventHandler> {
    public static Type<PaperActivateEventHandler> TYPE = new Type<PaperActivateEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperActivateEvent nativeEvent;
    
    public PaperActivateEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperActivateEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperActivateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperActivateEventHandler handler) {
        handler.onCoreActivate(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperActivateEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getItem() {
        return getNativeEvent().getDetail().item();
    }
   
}
