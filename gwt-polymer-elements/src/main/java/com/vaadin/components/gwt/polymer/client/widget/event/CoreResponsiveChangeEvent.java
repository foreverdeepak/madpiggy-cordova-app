package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreResponsiveChangeEvent extends GwtEvent<CoreResponsiveChangeEventHandler> {
    public static Type<CoreResponsiveChangeEventHandler> TYPE = new Type<CoreResponsiveChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent nativeEvent;
    
    public CoreResponsiveChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreResponsiveChangeEventHandler handler) {
        handler.onCoreResponsiveChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isNarrow() {
        return getNativeEvent().getDetail().narrow();
    }
   
}
