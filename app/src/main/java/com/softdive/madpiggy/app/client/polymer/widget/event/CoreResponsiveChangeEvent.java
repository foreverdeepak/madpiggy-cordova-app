package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreResponsiveChangeEvent extends GwtEvent<CoreResponsiveChangeEventHandler> {
    public static Type<CoreResponsiveChangeEventHandler> TYPE = new Type<CoreResponsiveChangeEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent nativeEvent;
    
    public CoreResponsiveChangeEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreResponsiveChangeEventHandler handler) {
        handler.onCoreResponsiveChange(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperResponsiveChangeEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isNarrow() {
        return getNativeEvent().getDetail().narrow();
    }
   
}
