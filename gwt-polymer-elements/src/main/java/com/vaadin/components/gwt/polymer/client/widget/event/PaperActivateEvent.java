package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperActivateEvent extends GwtEvent<PaperActivateEventHandler> {
    public static Type<PaperActivateEventHandler> TYPE = new Type<PaperActivateEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent nativeEvent;
    
    public PaperActivateEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperActivateEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperActivateEventHandler handler) {
        handler.onCoreActivate(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent getNativeEvent() {
        return nativeEvent;
    }

    public Object getItem() {
        return getNativeEvent().getDetail().item();
    }
   
}
