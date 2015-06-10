package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreCollapseOpenEvent extends GwtEvent<CoreCollapseOpenEventHandler> {
    public static Type<CoreCollapseOpenEventHandler> TYPE = new Type<CoreCollapseOpenEventHandler>();
    
    private CoreCollapseOpenEvent nativeEvent;
    
    public CoreCollapseOpenEvent(CoreCollapseOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreCollapseOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreCollapseOpenEventHandler handler) {
        handler.onCoreCollapseOpen(this);
    }
    
    public CoreCollapseOpenEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
