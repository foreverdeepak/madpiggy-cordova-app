package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperCollapseOpenEvent extends GwtEvent<PaperCollapseOpenEventHandler> {
    public static Type<PaperCollapseOpenEventHandler> TYPE = new Type<PaperCollapseOpenEventHandler>();
    
    private PaperCollapseOpenEvent nativeEvent;
    
    public PaperCollapseOpenEvent(PaperCollapseOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperCollapseOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperCollapseOpenEventHandler handler) {
        handler.onCoreCollapseOpen(this);
    }
    
    public PaperCollapseOpenEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
