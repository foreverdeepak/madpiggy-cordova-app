package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperResponsiveChangeEvent extends GwtEvent<PaperResponsiveChangeEventHandler> {
    public static Type<PaperResponsiveChangeEventHandler> TYPE = new Type<PaperResponsiveChangeEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent nativeEvent;
    
    public PaperResponsiveChangeEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResponsiveChangeEventHandler handler) {
        handler.onCoreResponsiveChange(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isNarrow() {
        return getNativeEvent().getDetail().narrow();
    }
   
}
