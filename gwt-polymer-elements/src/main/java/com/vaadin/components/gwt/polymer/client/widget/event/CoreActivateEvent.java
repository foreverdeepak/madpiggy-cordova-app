package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreActivateEvent extends GwtEvent<CoreActivateEventHandler> {
    public static Type<CoreActivateEventHandler> TYPE = new Type<CoreActivateEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent nativeEvent;
    
    public CoreActivateEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreActivateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreActivateEventHandler handler) {
        handler.onCoreActivate(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getItem() {
        return getNativeEvent().getDetail().item();
    }
   
}
