package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreCollapseOpenEvent extends GwtEvent<CoreCollapseOpenEventHandler> {
    public static Type<CoreCollapseOpenEventHandler> TYPE = new Type<CoreCollapseOpenEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent nativeEvent;
    
    public CoreCollapseOpenEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreCollapseOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreCollapseOpenEventHandler handler) {
        handler.onCoreCollapseOpen(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
